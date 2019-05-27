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

import com.highsoft.highcharts.common.hichartsclasses.HIAnimationOptionsObject;
import com.highsoft.highcharts.common.hichartsclasses.HIAnnotations;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HIGlobal;
import com.highsoft.highcharts.common.hichartsclasses.HILang;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPoint;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
                    Log.i(TAG, "hasFocus: " + hasFocus);
                    String strOptions = "javascript:onFocusOut()";
                    webView.evaluateJavascript(strOptions, new ValueCallback<String>() {
                        @Override
                        public void onReceiveValue(String s) {
                            Log.e("HIChartView", "Focus lost");
                        }
                    });
                } else Log.i(TAG, "hasFocus: " + hasFocus);
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
        Log.e(TAG, "mode: " + heightMode);
        if (heightMode == MeasureSpec.EXACTLY) {
            height = heightSize;
            Log.e(TAG, "mode: exactly");
        } else if (heightMode == MeasureSpec.AT_MOST) {
            Log.e(TAG, "mode: at_most");
            height = Math.min(heightMeasureSpec, heightSize);
        } else {
            Log.e(TAG, "rest");
            height = heightMeasureSpec;
        }
        this.height = height;
        this.width = width;
        setMeasuredDimension(width, height);

//        int desiredWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
//        int desiredHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
//
//        setMeasuredDimension(measureDimension(desiredWidth, widthMeasureSpec),
//                measureDimension(desiredHeight, heightMeasureSpec));
    }

    private int measureDimension(int desiredSize, int measureSpec) {
        int result;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else {
            result = desiredSize;
            if (specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }

        if (result < desiredSize){
            Log.e("ChartView", "The view is too small, the content might get cut");
        }
        Log.e(TAG, "measured dimesnion: " + result);
        return result;
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
            this.HTML.prepareJavaScript("export-csv", "js/lib/", suffix);
            this.HTML.prepareJavaScript("jspdf", "js/lib/", suffix);
            this.HTML.prepareJavaScript("moment", "js/lib/", suffix);
            this.HTML.prepareJavaScript("moment-timezone-with-data", "js/lib/", suffix);
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
            if(arg instanceof Map) {
                makeNativeCall((Map) arg);
            } else {
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

    private void makeNativeCall(Map arg){
        HashMap<String, Object> params = (HashMap<String, Object>) arg;
        String strJsMethod = String.format("javascript:%s", HINativeController.getMethodString(params));
        Log.e(TAG, "JS METHOD: " + strJsMethod);
        webView.evaluateJavascript(strJsMethod, new ValueCallback<String>() {
            @Override
            public void onReceiveValue(String value) {
                Log.e(TAG, "Native method called.");
                if(value != null) Log.e(TAG, "Val returned: " + String.valueOf(value).toString());
            }
        });
    }

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


    //----- Native Methods -----\\

    /**
     * Add an annotation to the chart after render time.
     * @param annotations The annotation options for the new, detailed annotation.
     */
    public void addAnnotation(HIAnnotations annotations){
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addAnnotation0");
            put("params", Collections.singletonList(annotations.getParams()));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add an annotation to the chart after render time.
     * @param annotations The annotation options for the new, detailed annotation.
     * @param redraw Whether to redraw the chart after adding.
     */
    public void addAnnotation(HIAnnotations annotations, boolean redraw){
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addAnnotation1");
            put("params", Arrays.asList(annotations.getParams(), redraw));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
     * @param options The axis options.
     */
    public void addXAxis(HIXAxis options){
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addAxis0");
            put("params", Arrays.asList(options.getParams(), true));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
     * @param options The axis options.
     * @param redraw Whether to redraw the chart after adding.
     */
    public void addXAxis(HIXAxis options, boolean redraw){
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addAxis1");
            put("params", Arrays.asList(options.getParams(), true, redraw));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
     * @param options The axis options.
     * @param redraw Whether to redraw the chart after adding.
     * @param animation Whether and how to apply animation in the redraw.
     */
    public void addXAxis(HIXAxis options, boolean redraw, HIAnimationOptionsObject animation){
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addAxis2");
            put("params", Arrays.asList(options.getParams(), true, redraw, animation));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
     * @param options The axis options.
     */
    public void addYAxis(HIYAxis options){
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addAxis0");
            put("params", Arrays.asList(options.getParams(), false));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
     * @param options The axis options.
     * @param redraw Whether to redraw the chart after adding.
     */
    public void addYAxis(HIYAxis options, boolean redraw){
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addAxis1");
            put("params", Arrays.asList(options.getParams(), false, redraw));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
     * @param options The axis options.
     * @param redraw Whether to redraw the chart after adding.
     * @param animation Whether and how to apply animation in the redraw.
     */
    public void addYAxis(HIYAxis options, boolean redraw, HIAnimationOptionsObject animation){
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addAxis2");
            put("params", Arrays.asList(options.getParams(), false, redraw, animation));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Set a new credits label for the chart.
     * @param options A configuration object for the new credits.
     */
    public void addCredits(HICredits options){
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addCredits");
            put("params", Collections.singletonList(options.getParams()));
        }};
        activity.runOnUiThread(() -> makeNativeCall(jsClassMethod));
    }

    /**
     * Add a series to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the series as a configuration option instead. With multiple axes, the offset is dynamically adjusted.
     * @param options The config options for the series.
     */
    public void addSeries(HISeries options) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addSeries0");
            put("params", Collections.singletonList(options.getParams()));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add a series to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the series as a configuration option instead. With multiple axes, the offset is dynamically adjusted.
     * @param options The config options for the series.
     * @param redraw Whether to redraw the chart after adding.
     */
    public void addSeries(HISeries options, boolean redraw) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addSeries1");
            put("params", Arrays.asList(options.getParams(), redraw));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add a series to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the series as a configuration option instead. With multiple axes, the offset is dynamically adjusted.
     * @param options The config options for the series.
     * @param redraw Whether to redraw the chart after adding.
     * @param animation Whether to apply animation, and optionally animation configuration.
     */
    public void addSeries(HISeries options, boolean redraw, HIAnimationOptionsObject animation) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addSeries2");
            put("params", Arrays.asList(options.getParams(), redraw, animation));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Add a series to the chart as drilldown from a specific point in the parent series. This method is used for async drilldown, when clicking a point in a series should result in loading and displaying a more high-resolution series. When not async, the setup is simpler using the drilldown.series options structure.
     * @param point The point from which the drilldown will start.
     * @param options The series options for the new, detailed series.
     */
    public void addSeriesAsDrilldown(HIPoint point, HISeries options) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "addSeriesAsDrilldown");
            put("params", Arrays.asList(point.getParams(), options.getParams()));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Cancel current sonification and reset cursor.
     */
    public void cancelSonify() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "cancelSonify0");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Cancel current sonification and reset cursor.
     * @param fadeOut Fade out as we pause to avoid clicks.
     */
    public void cancelSonify(boolean fadeOut) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "cancelSonify1");
            put("params", Collections.singletonList(fadeOut));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Remove the chart and purge memory. This method is called internally before adding a second chart into the same container, as well as on window unload to prevent leaks.
     */
    public void destroy() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "destroy");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * When the chart is drilled down to a child series, calling chart.drillUp() will drill up to the parent series. Requires the drilldown module.
     */
    public void drillUp() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "drillUp");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Hide the loading layer.
     */
    public void hideLoading() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "hideLoading");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Experimental function to send a chart's config to the Cloud for editing.
     * Limitations: All functions (formatters and callbacks) are removed since they're not JSON.
     */
    public void openInCloud() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "openInCloud");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Pause the running sonification.
     */
    public void pauseSonify() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "pauseSonify0");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Pause the running sonification.
     * @param fadeOut Fade out as we pause to avoid clicks.
     */
    public void pauseSonify(boolean fadeOut) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "pauseSonify1");
            put("params", Collections.singletonList(fadeOut));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Exporting module required. Clears away other elements in the page and prints the chart as it is displayed. By default, when the exporting module is enabled, a context button with a drop down menu in the upper right corner accesses this function.
     */
    public void print() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "print");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Redraw the chart after changes have been done to the data, axis extremes chart size or chart elements. All methods for updating axes, series or points have a parameter for redrawing the chart. This is true by default. But in many cases you want to do more than one operation on the chart before redrawing, for example add a number of points. In those cases it is a waste of resources to redraw the chart for each new point added. So you add the points and call HIChartView.redraw() after.
     */
    public void redraw() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "redraw0");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Redraw the chart after changes have been done to the data, axis extremes chart size or chart elements. All methods for updating axes, series or points have a parameter for redrawing the chart. This is true by default. But in many cases you want to do more than one operation on the chart before redrawing, for example add a number of points. In those cases it is a waste of resources to redraw the chart for each new point added. So you add the points and call HIChartView.redraw() after.
     * @param animation If or how to apply animation to the redraw.
     */
    public void redraw(HIAnimationOptionsObject animation) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "redraw0");
            put("params", Collections.singletonList(animation));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Remove an annotation from the chart.
     * @param id The annotation's id
     */
    public void removeAnnotationById(String id) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "removeAnnotation");
            put("params", Collections.singletonList(id));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Remove an annotation from the chart.
     * @param annotation Direct annotation object.
     */
    public void removeAnnotation(HIAnnotations annotation) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "removeAnnotation");
            put("params", Collections.singletonList(annotation));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Reset cursor to start. Requires series.sonify or chart.sonify to have been played at some point earlier.
     */
    public void resetSonifyCursor() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "resetSonifyCursor");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Reset cursor to end. Requires series.sonify or chart.sonify to have been played at some point earlier.
     */
    public void resetSonifyCursorEnd() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "resetSonifyCursorEnd");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Set the cursor to a point in different series
     * @param point The point to set the cursor to.
     */
    public void setSonifyCursor(HIPoint point) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "setSonifyCursor");
            put("params", Collections.singletonList(point));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Set the cursor to set of points in different series.
     * @param points The points to set the cursor to. The points have to be in different series that are being played simultaneously.
     */
    public void setSonifyCursor(List<HIPoint> points) {
        List<Map<String, Object>> params = new ArrayList<>();
        for(HIPoint p : points){
            params.add(p.getParams());
        }
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "setSonifyCursor");
            put("params", Collections.singletonList(params));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Shortcut to set the subtitle options.
     * @param options New subtitle options. The subtitle text itself is set by the options.text property.
     */
    public void setSubtitle(HISubtitle options) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "setSubtitle");
            put("params", Collections.singletonList(options));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Set a new title or subtitle for the chart.
     * @param titleOptions New subtitle options. The subtitle text itself is set by the options.text property.
     * @param subtitleOptions New subtitle options. The subtitle text itself is set by the subtitleOptions.text property.
     * @param redraw Whether to redraw the chart or wait for a later call to HIChartView.redraw().
     */
    public void setTitle(HISubtitle titleOptions, HISubtitle subtitleOptions, boolean redraw) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "setTitle");
            put("params", Arrays.asList(titleOptions, subtitleOptions, redraw));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Dim the chart and show a loading text. Options for the loading screen are defined in the loading options.
     * @param str A text to show in the loading label instead of the default one. The default text is set in HILang.loading.
     */
    public void showLoading(String str) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "showLoading");
            put("params", Collections.singletonList(str));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Sonify a chart.
     * @param options The options for sonifying this chart.
     */
    public void sonify(Map options) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "sonify");
            put("params", Collections.singletonList(options));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled, re-formatted etc.
     *
     * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an id option is used to map the new option set to an existing object. If an existing object of the same id is not found, the corresponding item is updated. So for example, running chart.update with a series item without an id, will cause the existing chart's series with the same index in the series array to be updated. When the oneToOne parameter is true, chart.update will also take care of adding and removing items from the collection. Read more under the parameter description below.
     *
     * Note that when changing series data, chart.update may mutate the passed data options.
     *
     * @param options A configuration object for the new chart options.
     */
    public void update(HIOptions options) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "update0");
            put("params", Collections.singletonList(options));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled, re-formatted etc.
     *
     * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an id option is used to map the new option set to an existing object. If an existing object of the same id is not found, the corresponding item is updated. So for example, running chart.update with a series item without an id, will cause the existing chart's series with the same index in the series array to be updated. When the oneToOne parameter is true, chart.update will also take care of adding and removing items from the collection. Read more under the parameter description below.
     *
     * Note that when changing series data, chart.update may mutate the passed data options.
     *
     * @param options A configuration object for the new chart options.
     * @param redraw Whether to redraw the chart.
     */
    public void update(HIOptions options, boolean redraw) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "update1");
            put("params", Arrays.asList(options, redraw));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled, re-formatted etc.
     *
     * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an id option is used to map the new option set to an existing object. If an existing object of the same id is not found, the corresponding item is updated. So for example, running chart.update with a series item without an id, will cause the existing chart's series with the same index in the series array to be updated. When the oneToOne parameter is true, chart.update will also take care of adding and removing items from the collection. Read more under the parameter description below.
     *
     * Note that when changing series data, chart.update may mutate the passed data options.
     *
     * @param options A configuration object for the new chart options.
     * @param redraw Whether to redraw the chart.
     * @param oneToOne When true, the series, xAxis and yAxis collections will be updated one to one, and items will be either added or removed to match the new updated options. For example, if the chart has two series and we call chart.update with a configuration containing three series, one will be added. If we call chart.update with one series, one will be removed. Setting an empty series array will remove all series, but leaving out the series property will leave all series untouched. If the series have id's, the new series options will be matched by id, and the remaining ones removed.
     */
    public void update(HIOptions options, boolean redraw, boolean oneToOne) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "update2");
            put("params", Arrays.asList(options, redraw, oneToOne));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled, re-formatted etc.
     *
     * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an id option is used to map the new option set to an existing object. If an existing object of the same id is not found, the corresponding item is updated. So for example, running chart.update with a series item without an id, will cause the existing chart's series with the same index in the series array to be updated. When the oneToOne parameter is true, chart.update will also take care of adding and removing items from the collection. Read more under the parameter description below.
     *
     * Note that when changing series data, chart.update may mutate the passed data options.
     *
     * @param options A configuration object for the new chart options.
     * @param redraw Whether to redraw the chart.
     * @param oneToOne When true, the series, xAxis and yAxis collections will be updated one to one, and items will be either added or removed to match the new updated options. For example, if the chart has two series and we call chart.update with a configuration containing three series, one will be added. If we call chart.update with one series, one will be removed. Setting an empty series array will remove all series, but leaving out the series property will leave all series untouched. If the series have id's, the new series options will be matched by id, and the remaining ones removed.
     * @param animation Whether to apply animation, and optionally animation configuration.
     */
    public void update(HIOptions options, boolean redraw, boolean oneToOne, HIAnimationOptionsObject animation) {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "update3");
            put("params", Arrays.asList(options, redraw, oneToOne, animation));
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Export-data module required. View the data in a table below the chart.
     */
    public void viewData() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "viewData");
        }};
        makeNativeCall(jsClassMethod);
    }

    /**
     * Zoom the chart out after a user has zoomed in. See also Axis.setExtremes.
     */
    public void zoomOut() {
        Map<String, Object> jsClassMethod = new HashMap<String, Object>() {{
            put("class", "Chart");
            put("method", "zoomOut");
        }};
        makeNativeCall(jsClassMethod);
    }

}
