package com.highsoft.highcharts.Core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by bartosz on 09.03.18.
 */

final class HIFunctionHandler {

    private HIConsumer<HIChartContext> hiConsumer;
    private String[] properties;
    private HIFunctionInterface<HIChartContext, String> hiFunctionInterface;
    private Runnable runnable;
    private WebView webView;
    private String id;

    HIFunctionHandler(WebView webView) {
        this.webView = webView;
    }

    HIFunctionHandler(Runnable runnable) {
        this.runnable = runnable;
    }

    HIFunctionHandler(HIConsumer<HIChartContext> hiConsumer, WebView webView, String id, String[] properties) {
        this.hiConsumer = hiConsumer;
        this.properties = properties;
        this.webView = webView;
        this.id = id;
    }

//    HIFunctionHandler(HIFunctionInterface<HIChartContext, String> hiFunctionInterface, WebView webView, Activity activity) {
//        this.hiFunctionInterface = hiFunctionInterface;
//        this.webView = webView;
//        this.activity = activity;
//    }

    @SuppressLint("AddJavascriptInterface")
    @JavascriptInterface
    public void androidHandler(){
        if(this.hiConsumer != null) {
            String script = "javascript:getPropertiesDictionary('%s', %s)";
            String argsStr = "[";
            for (String arg : properties) {
                argsStr = argsStr.concat("'" + arg + "',");
            }
            argsStr = argsStr.substring(0, argsStr.length() - 1).concat("]");
            script = String.format(script, this.id, argsStr);
            String finalScript = script;
            webView.post(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                @Override
                public void run() {
                    webView.evaluateJavascript(finalScript, new ValueCallback<String>() {
                                @Override
                                public void onReceiveValue(String s) {
                                    Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
                                    Map<String, Object> map = new Gson().fromJson(s, mapType);
                                    hiConsumer.accept(new HIChartContext(map));
                                }
                            });
                }
            });
        }
        else this.runnable.run();
    }
}
