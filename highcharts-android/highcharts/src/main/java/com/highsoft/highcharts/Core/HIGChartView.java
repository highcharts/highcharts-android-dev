package com.highsoft.highcharts.Core;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.Dimension;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/**
 *  Highcharts Chart View Class. Initialize this as a normal view and set
 *  required properties.
 */

public class HIGChartView extends RelativeLayout {

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

    private WebView webView;
    private HIGHTML HTML;
    private RelativeLayout.LayoutParams params;
    private int width;
    private int height;
    private boolean loaded = false;

    /**
     * Basic constructor with default chart size
     *
     * @param c Context from Layout which will be containing chart
     */
    public HIGChartView(Context c) {
        super(c);
        this.activity = (Activity) c;
        initialize(c);
    }

    /**
     * Another basic constructor, this one is called automatically when you create view in XML
     * @param c app context
     * @param attrs attributes from xml
     */
    public HIGChartView(Context c, AttributeSet attrs){
        super(c, attrs);
        this.setWillNotDraw(false);
        this.activity = (Activity) c;
        initialize(c);
    }

    private void initialize(final Context context) {
//        this.debug = true;
        this.HTML = new HIGHTML();
        this.HTML.baseURL = "";
        HIGWebViewClient webViewClient = new HIGWebViewClient();

        try {
            this.HTML.loadHTML(context, "highcharts.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.webView = new WebView(context);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setDomStorageEnabled(true);
        this.webView.setWebViewClient(webViewClient);

        // Adding exporting module to the chart
        HIGExportModule higExportModule = new HIGExportModule(activity, this.webView);
        this.webView.addJavascriptInterface(higExportModule, "jsint");
        this.webView.setDownloadListener(higExportModule);

        //this handler is made for displaying logs from JS code in Android console
        if(this.debug != null){
            this.webView.setWebChromeClient(new WebChromeClient(){
                public boolean onConsoleMessage(ConsoleMessage cm){
                    Log.d("JS log", cm.message() + " --From line " + cm.lineNumber() + " of " + cm.sourceId());
                    return true;
                }
            });
        }

        // Setting up the Chart layout params
        if(params == null) params = new RelativeLayout.LayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        webView.setLayoutParams(params);
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

        float density = getResources().getDisplayMetrics().density;
        this.HTML.prepareViewWidth(Math.round(width/density), Math.round(height/density));

        if (this.plugins == null) {
            this.plugins = new ArrayList<>();
        }

        String suffix = (this.debug != null) ? ".src.js" : ".js";

        // Load Highchart main scripts.
        this.HTML.prepareJavaScript("highcharts", "js/", suffix);
        this.HTML.prepareJavaScript("highcharts-more", "js/", suffix);
        this.HTML.prepareJavaScript("highcharts-3d", "js/", suffix);

        List plugins = HIGDependency.pluginsForOptions(this.options.getParams());
        this.plugins.addAll(plugins);
        this.plugins.addAll(new ArrayList<>(Arrays.asList("exporting", "offline-exporting", "offline-exporting-wrap")));
        this.plugins = new ArrayList(new HashSet(this.plugins));

        for (Object plugin : this.plugins) {
            this.HTML.prepareJavaScript((String)plugin, "js/modules/", suffix);
        }

        // Adding libraries for PDF export
        this.HTML.prepareJavaScript("rgbcolor", "js/lib/", suffix);
        this.HTML.prepareJavaScript("svg2pdf", "js/lib/", suffix);

        // Load Highchart themes
        this.HTML.prepareJavaScript(this.theme, "js/themes/", suffix);

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


    private void loadChartOptions() {

        this.HTML.prepareOptions(this.options.getParams());
        String options = String.format("var chart = new Highcharts.Chart(%s)", this.HTML.options);
        // Current JS actualization
        this.webView.evaluateJavascript(options, new ValueCallback<String>() {
            @Override
            public void onReceiveValue(String value) {
                System.out.println(value);
            }
        });
    }

    /**
     * Method to reload the chart. Use it after updating the chart options.
     */
    public void reload() {
        this.loadChartOptions();
    }
}
