package com.highsoft.highcharts.Core;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.WebView;

/**
 * Created by bartosz on 12.03.18.
 */

public class HIContext {

    private WebView webView;
    private Activity activity;
    private String id;
    static Object value;


    HIContext(WebView webView, Activity a, String id) {
        this.webView = webView;
        this.activity = a;
        this.id = id;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public int getParameter(String param){
        int val;
        System.out.println("Param to get from JS: " + param);
        String template = "javascript:getProperty('%s', '%s')";
        String loadUrl = String.format(template, this.id, param);
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                webView.loadUrl(loadUrl);
            }
        });
        System.out.println(param + " = " + value);
        //Shared preferences not safe at all
//        SharedPreferences sharedPref = activity.getPreferences(Context.MODE_PRIVATE);
//        val = sharedPref.getInt("val", 0);
//        return val;
        return (int) value; // needs casting, but why?
    }
}
