package com.highsoft.highcharts.Core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.gson.Gson;

/**
 * Created by bartosz on 09.03.18.
 */

final class HIFunctionHandler {

    private HIConsumer<HIContext> hiConsumer;
    private HIFunctionInterface<HIContext, String> hiFunctionInterface;
    private Runnable runnable;
    private WebView webView;
    private Activity activity;
    private String id;

    HIFunctionHandler(Runnable runnable) {
        this.runnable = runnable;
    }

    HIFunctionHandler(WebView webView, Activity activity) {
        this.webView = webView;
        this.activity = activity;
    }

    HIFunctionHandler(HIConsumer<HIContext> hiConsumer, WebView webView, Activity activity, String id) {
        this.hiConsumer = hiConsumer;
        this.webView = webView;
        this.activity = activity;
        this.id = id;
    }

//    HIFunctionHandler(HIFunctionInterface<HIContext, String> hiFunctionInterface, WebView webView, Activity activity) {
//        this.hiFunctionInterface = hiFunctionInterface;
//        this.webView = webView;
//        this.activity = activity;
//    }

    @SuppressLint("AddJavascriptInterface")
    @JavascriptInterface
    public void androidHandler(){
        if(this.hiConsumer != null)
            this.hiConsumer.accept(new HIContext(this.webView, this.activity, this.id));
        else this.runnable.run();


//        if(this.hiConsumer != null){
//            this.hiConsumer.accept(new HIContext(this.webView, this.activity));
//        }
//        else{
//            System.out.println("HIConsumer jest nullem");
//            this.hiFunctionInterface.apply(new HIContext(this.webView, this.activity));
//        }
    }

    @JavascriptInterface
    public String getValue(String str) throws Exception {
        System.out.println("Javascript value handled!");
        System.out.println("Object get from JS: " + str);
        return str;

//        HIContext.value = obj;


//        System.out.println("The static value is: " + HIContext.value);
        //Shared preferences not safe at all
//        SharedPreferences sharedPref = activity.getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putInt("val", obj).apply();

//        if(obj instanceof Boolean) editor.putBoolean("val", (Boolean) obj);
//        else if (obj instanceof Float) editor.putFloat("val", (Float) obj);
//        else if (obj instanceof Integer) editor.putInt("val", (Integer) obj);
//        else if (obj instanceof Long) editor.putLong("val", (Long) obj);
//        else if (obj instanceof String) editor.putString("val", (String) obj);
//        else throw new Exception("Highcharts unsupported value");
//        editor.apply();


    }

}
