package com.highsoft.highcharts.Core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by bartosz on 12.03.18.
 */

public class HIContext {

    private Map<String, String> map;
    private WebView webView;
    private final Activity activity;
    private String id;
    public static Object value;
    boolean returnReady = false;
    static final Object lock = new Object();
    private String returnValue;
    private CountDownLatch latch = null;
    private static String staticStr;


    HIContext(WebView webView, Activity a, String id) {
        this.webView = webView;
        this.activity = a;
        this.id = id;
    }

    HIContext(WebView webView, Activity a, String id, Map<String, String> map) {
        this.webView = webView;
        this.activity = a;
        this.id = id;
        this.map = map;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public String tester(String par){
        getParameter(par);
        return staticStr;
    }

    public String getVal(String val){
        return map.get(val);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void getParameter(String param) {
        latch = new CountDownLatch(1);
        System.out.println("getParameter method; Thread name: " + Thread.currentThread().getName());
        Thread javaBridgeThread = Thread.currentThread();
        System.out.println("Param to get from JS: " + param);
        String template = "javascript:getProperty('%s', '%s')";
        String loadUrl = String.format(template, this.id, param);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("WebView.post; Thread name: " + Thread.currentThread().getName());
//                try {
                    webView.evaluateJavascript(loadUrl, new ValueCallback<String>() {
                                @Override
                                public void onReceiveValue(String s) {
                                    System.out.println("WebView.evaluateJavascript.onReceiveValue; Thread name: " + Thread.currentThread().getName());
                                    System.out.println("Value " + s);
                                    returnValue = s;
                                    staticStr = s;
                                }
                            }
                    );
//                } finally {
//                    try {
//                        latch.countDown();
//                    } catch (Exception e) { e.printStackTrace(); }
//                }

            }
        };

        webView.post(runnable);

//        try {
//            System.out.println("Waiting latch in...");
////            latch.await(1000, TimeUnit.MILLISECONDS);
//            System.out.println("Thread: " + Thread.currentThread().getName());
//            latch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("getParameter method; Thread name: " + Thread.currentThread().getName());
//        System.out.println("Just before return: " + returnValue);
        System.out.println("Just before return: " + staticStr);
//        return returnValue;
    }
}
