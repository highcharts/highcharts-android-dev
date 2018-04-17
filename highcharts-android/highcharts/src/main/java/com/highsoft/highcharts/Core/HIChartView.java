package com.highsoft.highcharts.Core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.RelativeLayout;

import com.highsoft.highcharts.Common.HIChartsClasses.HIGlobal;
import com.highsoft.highcharts.Common.HIChartsClasses.HILang;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Observable;
import java.util.Observer;

/**
 *  Highcharts Chart View Class. Initialize this as a normal view and set
 *  required properties.
 */

public class HIChartView extends RelativeLayout {

    /**
     *  Options are main configuration entry point for chart view, for more
     *  information read API documentation.
     */
    public HIOptions options;
    /**
     *  Theme name to load from file system after preloading.
     */
    public String theme;
    /**
     *  Additional plugins to load into chart after preloading.
     */
    public List<String> plugins;
    /**
     *  This param allows to debug chart view in Android console. Loads unminified
     *  JS files to ease debuging.
     */
    private Boolean debug;
    /**
     *  This is needed to make interactions between chart and your application view.
     */
    private Activity activity;

    /**
     * Language object. It is used for all language specific matters.
     */
    public HILang lang;

    /**
     * Global object. It contains global options that apply to the chart view but are not within other classes,
     */
    public HIGlobal global;

    private WebView webView;
    private HIGHTML HTML;
    private int width;
    private int height;
    private boolean loaded = false;

    /**
     * Basic constructor with default chart size
     *
     * @param c Context from Layout which will be containing chart
     */
    public HIChartView(Context c) {
        super(c);
        this.activity = (Activity) c;
        initialize(c);
    }

    /**
     * Another basic constructor, this one is called automatically when you create view in XML
     * @param c app context
     * @param attrs attributes from xml
     */
    public HIChartView(Context c, AttributeSet attrs){
        super(c, attrs);
        this.setWillNotDraw(false);
        this.activity = (Activity) c;
        initialize(c);
    }

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    private void initialize(final Context context) {
        this.debug = false;
        this.webView = new WebView(context);
        this.HTML = new HIGHTML(this.webView);
        this.HTML.baseURL = "";
        HIGWebViewClient webViewClient = new HIGWebViewClient();
        try {
            this.HTML.loadHTML(context, "highcharts.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.webView.setBackgroundColor(Color.TRANSPARENT);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setDomStorageEnabled(true);
        this.webView.setWebViewClient(webViewClient);
        //improve chart loading performance, CSS animations are loading faster!
        this.webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        // Adding exporting module to the chart
        HIGExportModule higExportModule = new HIGExportModule(activity, this.webView);
        this.webView.setDownloadListener(higExportModule);
        //JS Handler for export
        this.webView.addJavascriptInterface(higExportModule, "AndroidExport");
        //JS Handler for HIChartContext
        HIFunctionHandler hiFunctionHandler = new HIFunctionHandler(this.webView);
        this.webView.addJavascriptInterface(hiFunctionHandler, "Android");

        //this handler is made for displaying logs from JS code in Android console
        if(this.debug){
            this.webView.setWebChromeClient(new WebChromeClient(){
                public boolean onConsoleMessage(ConsoleMessage cm){
                    Log.i("jsDebug", "turned ON");
                    Log.e("libHC", cm.message() + " --From line " + cm.lineNumber() + " of " + cm.sourceId());
                    return true;
                }
            });
        } else {
            this.webView.setWebChromeClient(new WebChromeClient(){
                public boolean onConsoleMessage(ConsoleMessage cm){
                    Log.e("libHC", cm.message());
                    return true;
                }
            });
        }
        this.addView(webView);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int width;
        if (widthMode == MeasureSpec.EXACTLY) {
            width = widthSize;
        } else if (widthMode == MeasureSpec.AT_MOST) {
            width = Math.min(widthMeasureSpec, widthSize);
        } else {
            width = widthMeasureSpec;
        }

        int height;
        if (heightMode == MeasureSpec.EXACTLY) {
            height = heightSize;
        } else if (heightMode == MeasureSpec.AT_MOST) {
            height = Math.min(heightMeasureSpec, heightSize);
        } else {
            height = heightMeasureSpec;
        }
        this.height = height;
        this.width = width;
        setMeasuredDimension(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        if(!loaded) loadChartHtml(); //loading html only if it was not loaded before
    }

    /**
     * Most operations on Chart Html are done here
     */
    void loadChartHtml() {

        checkForOptions(this.options);
        float density = getResources().getDisplayMetrics().density;
        this.HTML.prepareViewWidth(Math.round(width/density), Math.round(height/density));

        if (this.plugins == null) {
            this.plugins = new ArrayList<>();
        }

        String suffix = (this.debug) ? ".src.js" : ".js";

        // Load Highchart main scripts.
        this.HTML.prepareJavaScript("highcharts", "js/", suffix);
        this.HTML.prepareJavaScript("highcharts-more", "js/", suffix);
        this.HTML.prepareJavaScript("highcharts-3d", "js/", suffix);

        List plugins = HIGDependency.pluginsForOptions(this.options.getParams());
        this.plugins.addAll(plugins);
        this.plugins.addAll(new ArrayList<>(Arrays.asList("exporting", "offline-exporting")));
        this.plugins = new ArrayList(new HashSet(this.plugins));

        for (Object plugin : this.plugins) {
            this.HTML.prepareJavaScript((String)plugin, "js/modules/", suffix);
        }

        // Adding libraries for PDF export
        this.HTML.prepareJavaScript("rgbcolor", "js/lib/", suffix);
        this.HTML.prepareJavaScript("svg2pdf", "js/lib/", suffix);

        // Load Highchart themes
        this.HTML.prepareJavaScript(this.theme, "js/themes/", suffix);

        if(this.lang != null)
            this.HTML.prepareLang(this.lang.getParams());
        if(this.global != null)
            this.HTML.prepareGlobal(this.global.getParams());
        this.HTML.prepareOptions(this.options.getParams());
        this.HTML.injectJavaScriptToHTML();

        /* Loading the HTML to the WebView **/
        this.webView.loadDataWithBaseURL(
                "file:///android_asset/",
                this.HTML.html,
                "text/html",
                "UTF-8",
                "");
        this.loaded = true;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void loadChartOptions() {

        this.HTML.prepareOptions(this.options.getParams());
        String options = String.format("var chart = new Highcharts.Chart(%s)", this.HTML.options);
        // Current JS actualization
        this.webView.evaluateJavascript(options, new ValueCallback<String>() {
            @Override
            public void onReceiveValue(String value) {
            }
        });
    }

    /**
     * Method to reload the chart. Use it after updating the chart options.
     */
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void reload() {
        this.loadChartOptions();
    }

    private void checkForOptions(HIOptions options){
        if(options == null)
            throw new NoSuchElementException("HIOptions not found in HIChartView");
    }

    //--- Testing UPDATE Feature ---//

    private Observer optionsChanged = new Observer() {
        @Override
        public void update(Observable observable, Object o) {
            HTML.prepareOptions(options.getParams());
            String options = String.format("updateOptions(%s)", HTML.options);
            webView.evaluateJavascript(options, new ValueCallback<String>() {
                @Override
                public void onReceiveValue(String s) {
                    Log.i("HIChartView", "Updated");
                }
            });
        }
    };

//    private void setOptions(HIOptions options) {
//        this.options = options;
//        this.options.addObserver(optionsChanged);
//        Log.v("HIOptions", "set");
//    }
//
//    private HIOptions getOptions() {
//        return options;
//    }
}
