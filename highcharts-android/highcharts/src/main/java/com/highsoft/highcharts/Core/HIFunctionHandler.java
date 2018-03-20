package com.highsoft.highcharts.Core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bartosz on 09.03.18.
 */

final class HIFunctionHandler {

    private HIConsumer<HIContext> hiConsumer;
    private String[] args;
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

    HIFunctionHandler(HIConsumer<HIContext> hiConsumer, WebView webView, Activity activity, String id, String[] args) {
        this.hiConsumer = hiConsumer;
        this.args = args;
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
        if(this.hiConsumer != null) {
            String script = "javascript:getPropertiesDictionary('%s', %s)";
            String argsStr = "[";
            for (String arg : args) {
                argsStr = argsStr.concat("'" + arg + "',");
            }
            argsStr = argsStr.substring(0, argsStr.length() - 1).concat("]");
            script = String.format(script, this.id, argsStr);
            System.out.println("script: " + script);
            String finalScript = script;
            webView.post(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                @Override
                public void run() {
                    webView.evaluateJavascript(finalScript, new ValueCallback<String>() {
                                @Override
                                public void onReceiveValue(String s) {
                                    System.out.println("Starting HIFunction...");
                                    Type mapType = new TypeToken<Map<String, String>>(){}.getType();
                                    Map<String, String> map = new Gson().fromJson(s, mapType);
//                                    for (Map.Entry<String, String> entry : map.entrySet())
//                                        System.out.println(entry.getKey() + "/" + entry.getValue());

//                                    JsonReader reader = new JsonReader(new StringReader(s));
//                                    try {
//                                        if(reader.peek() != JsonToken.NULL){
//                                            if(reader.peek() == JsonToken.BEGIN_OBJECT){
//                                                System.out.println("nie jest nullem");
//                                                String msg = reader.nextString();
//                                                if (msg != null) {
//                                                    System.out.println("First msg: " + msg);
//                                                } else {
//                                                    System.out.println("msg is NULL");
//                                                }
//                                            }
//                                        }
//                                    } catch (IOException e) {
//                                        Log.e("HIFunction", "IOException", e);
//                                    } finally {
//                                        try {
//                                            reader.close();
//                                        } catch (IOException e) {
//                                            e.printStackTrace();
//                                        }
//                                    }
//                                    System.out.println("Sended args: " + s);
                                    hiConsumer.accept(new HIContext(webView, activity, id, map));
                                }
                            });
                }
            });
        }
//        if(this.hiConsumer != null)
//            this.hiConsumer.accept(new HIContext(this.webView, this.activity, this.id));
        else this.runnable.run();
    }

    @JavascriptInterface
    public String getValue(String str) throws Exception {
        System.out.println("WebView.JavascriptInterface; Thread name: " + Thread.currentThread().getName());
        System.out.println("Javascript value handled!");
        System.out.println("Object get from JS: " + str);
        return str;
//        HIContext.value = obj;
    }

}
