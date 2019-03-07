package com.highsoft.highcharts.core;

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

import com.highsoft.highcharts.common.hichartsclasses.HIGlobal;
import com.highsoft.highcharts.common.hichartsclasses.HILang;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 *  Highcharts Chart View Class. Initialize this as a normal view and set
 *  required properties.
 */

//todo check if ViewGroup or any other view will be better as a subclass
public class HIChartView extends RelativeLayout/*ViewGroup*/{

    private static final String TAG = "HIChartView";
    /**
     *  Options are main configuration entry point for chart view, for more
     *  information read API documentation.
     */
    private HIOptions options;
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
     *  This is needed to make interactions between chart and your appalication view.
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

    private HashMap<HIFunctionHandler, String> jsHandlersMap;

    /**
     * Basic constructor with default chart size
     *
     * @param c Context from Layout which will be containing chart
     */
    public HIChartView(Context c) {
        super(c);
        this.jsHandlersMap = new HashMap<>();
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
        Log.e(TAG, "XML constructor called.");
        jsHandlersMap = new HashMap<>();
        this.setWillNotDraw(false);
        this.activity = (Activity) c;
        initialize(c);
    }

//    @Override
//    protected void onLayout(boolean changed, int l, int t, int r, int b) {
//    }


    @Override
    public void setOnFocusChangeListener(OnFocusChangeListener l) {
        Log.e(TAG, "setOnFocusChangeListener @Override successfully");
        super.setOnFocusChangeListener(l);
    }

    public void addFont(int id){
        this.HTML.prepareCustomFont(activity, id);
    }

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    private void initialize(final Context context) {
        this.debug = false;
        this.webView = new WebView(context);

        this.webView.setVerticalScrollBarEnabled(false); // added for scrollbar bug
        this.webView.setHorizontalScrollBarEnabled(false); // -- || --
        this.webView.setBackgroundColor(Color.TRANSPARENT);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setDomStorageEnabled(true);
        HIGWebViewClient webViewClient = new HIGWebViewClient();
        this.webView.setWebViewClient(webViewClient);
        //improve chart loading performance, CSS animations are loading faster!
        this.webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        // Adding exporting module to the chart
        HIGExportModule higExportModule = new HIGExportModule(activity, this.webView);
        this.webView.setDownloadListener(higExportModule);
        //JS Handler for export
        this.webView.addJavascriptInterface(higExportModule, "AndroidExport");
        //JS Handler for HIChartContext
        HIFunctionHandler hiFunctionHandler = new HIFunctionHandler();
        this.webView.addJavascriptInterface(hiFunctionHandler, "Native");
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
                    Log.e("Highcharts", cm.message());
                    return true;
                }
            });
        }
        this.webView.setFocusableInTouchMode(true);
        this.webView.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus) {
                    Log.e(TAG, "onFocusChange() called; hasFocus: " + hasFocus);
                    String strOptions = "javascript:onFocusOut()";
                    webView.evaluateJavascript(strOptions, new ValueCallback<String>() {
                        @Override
                        public void onReceiveValue(String s) {
                            Log.e("HIChartView", "Focus lost");
                        }
                    });
                } else Log.e(TAG, "onFocusChange() called; hasFocus: " + hasFocus);
            }
        });
        this.HTML = new HIGHTML(hiFunctionHandler);
        this.HTML.baseURL = "";
        try {
            this.HTML.loadHTML(context, "highcharts.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.addView(webView);
    }

//    final GestureDetector detector = new GestureDetector(new GestureDetector.OnGestureListener() {
//        @Override
//        public boolean onDown(MotionEvent e) {
//            return false;
//        }
//
//        @Override
//        public void onShowPress(MotionEvent e) {
//
//        }
//
//        @Override
//        public boolean onSingleTapUp(MotionEvent e) {
//            return false;
//        }
//
//        @Override
//        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
//            return false;
//        }
//
//        @Override
//        public void onLongPress(MotionEvent e) {
//
//        }
//
//        @Override
//        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
//            return false;
//        }
//
//    });
//
//    @Override
//    public void onWindowFocusChanged(boolean hasWindowFocus) {
//        super.onWindowFocusChanged(hasWindowFocus);
//        Log.e(TAG, "onWindowFocusChanged() " + hasWindowFocus);
//    }
//
//
//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent event) {
//        int action = event.getActionMasked();
//        switch (action) {
//            case (MotionEvent.ACTION_HOVER_EXIT):
//                Log.e(TAG, "Movement occurred outside bounds " +
//                        "of current screen element");
//                return super.onTouchEvent(event);
//            default:
//                return super.onTouchEvent(event);
//        }
//    }




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
//        loadChartHtml(); //loading html only if it was not loaded before
    }

    /**
     * Most operations on Chart Html are done here`
     */
    void loadChartHtml() {

        if(isOptionsIncluded(this.options)){
            float density = getResources().getDisplayMetrics().density;
            this.HTML.prepareViewWidth(Math.round(width/density), Math.round(height/density));

            if (this.plugins == null) {
                this.plugins = new LinkedList<>();
            }

            String suffix = (this.debug) ? ".src.js" : ".js";

            // Load Highchart main scripts.
            this.HTML.scripts = ""; //fix for doubling scripts when update
            this.HTML.prepareJavaScript("highcharts", "js/", suffix);
            this.HTML.prepareJavaScript("highcharts-more", "js/", suffix);
            this.HTML.prepareJavaScript("highcharts-3d", "js/", suffix);

            List plugins = HIGDependency.pluginsForOptions(this.options.getParams());
            this.plugins.addAll(plugins);
            this.plugins.addAll(new LinkedList<>(Arrays.asList("exporting", "offline-exporting")));
            this.plugins = new LinkedList<>(new HashSet(this.plugins));

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
        } else {
            Log.e(TAG, "HIOptions not attached. Chart won't render without options.");
        }
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
    @Deprecated
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void reload() {
        this.loadChartOptions();
    }

    private boolean isOptionsIncluded(HIOptions options) {
        return options != null;
    }

    //--- UPDATE Feature ---//
    protected Observer basicObserver = new Observer() {
        @Override
        public void update(Observable observable, Object arg) {
            if(arg instanceof HashMap) {
                Log.e(TAG, "Native function called!");
                HashMap<String, Object> params = (HashMap<String, Object>) arg;
                for (Map.Entry<String, Object> entry : params.entrySet()) { // todo delete printing
                    System.out.println(entry.getKey() + "/" + entry.getValue());
                }
                String strJsMethod = String.format("javascript:%s", HINativeController.getMethodString(params));
                Log.e(TAG, "" + strJsMethod);
                webView.evaluateJavascript(strJsMethod, new ValueCallback<String>() {
                    @Override
                    public void onReceiveValue(String value) {
                        Log.e(TAG, "Native method called.");
                        if(value != null) Log.e(TAG, "Val returned: " + value);
                    }
                });
            } else {
                Log.e(TAG, "Update called!");
                HTML.prepareOptions(options.getParams());
                String strOptions = String.format("javascript:updateOptions(%s)", HTML.options);
                webView.evaluateJavascript(strOptions, new ValueCallback<String>() {
                    @SuppressLint("JavascriptInterface")
                    @Override
                    public void onReceiveValue(String s) {
                        Log.i(TAG, "Updated");
                    }
                });
            }
        }

    };


    /**
     *  Options are main configuration entry point for chart view, for more
     *  information read API documentation.
     */
    public void setOptions(HIOptions options) {
        this.options = options;
        this.options.addObserver(basicObserver);
        this.options.notifyObservers();
    }

    public HIOptions getOptions() {
        return options;
    }

    private void getHTMLContent(){
        //TO COMMENT
//        System.out.println("HTML CONTENT");
        this.webView.evaluateJavascript(
//                "(function() { return ('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>'); })();",
//                "javascript:window.HtmlViewer.showHTML" +
//                        "('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');",
                "javascript:console.log(document.getElementsByTagName('BODY')[0].script);",
                new ValueCallback<String>() {
                    @Override
                    public void onReceiveValue(String html) {
                        Log.d("HTML", html);
                    }
                });
    }
}
