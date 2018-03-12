package com.highsoft.highcharts.Core;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/**
 * Created by bartosz on 09.03.18.
 */

public class HIFunctionHandler {
    private Runnable runnable;
    private HIFunctionInterface hiFunctionInterface;
    private WebView webView;
    private Activity activity;
    public HIFunctionHandler(Runnable runnable) {
        this.runnable = runnable;
    }

    public HIFunctionHandler(HIFunctionInterface hiFunctionInterface, WebView webView, Activity activity) {
        this.hiFunctionInterface = hiFunctionInterface;
        this.webView = webView;
        this.activity = activity;
    }

//    @RequiresApi(api = Build.VERSION_CODES.N)
    @JavascriptInterface
    public void androidHandlerPlain(){
        this.runnable.run();
    }

    @JavascriptInterface
    public void androidHandler(){
//        System.out.println("Value: " + this.val);
//        function.accept(this.val);
        this.hiFunctionInterface.accept(new HIContext(this.webView, this.activity));
    }

    @JavascriptInterface
    public void getNr(int nr){
        System.out.println("Javascript value handled!");
        System.out.println("The value is: " + nr);
    }

}
