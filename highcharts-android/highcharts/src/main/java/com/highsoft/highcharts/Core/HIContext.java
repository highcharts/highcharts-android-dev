package com.highsoft.highcharts.Core;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/**
 * Created by bartosz on 12.03.18.
 */

public class HIContext {

    private final WebView webView;
    private Activity activity;


    public HIContext(WebView webView, Activity a) {
        this.webView = webView;
        this.activity = a;
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void getParameter(int p){
        System.out.println("Parameter you passed: " + p);
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                webView.loadUrl("javascript:console.log('JS call from Android...')");
                webView.loadUrl("javascript:getNr()");
            }
        });
//        webView.post( () -> webView.loadUrl("javascript:testEcho('JS call from Android..."));
//        webView.evaluateJavascript("testEcho('Hello World!')", new ValueCallback<String>() {
//            @Override
//            public void onReceiveValue(String s) {
//                System.out.println(s);
//            }
//        });
    }
}
