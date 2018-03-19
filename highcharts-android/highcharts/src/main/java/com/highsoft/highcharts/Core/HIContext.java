package com.highsoft.highcharts.Core;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Toast;

import org.liquidplayer.*;

/**
 * Created by bartosz on 12.03.18.
 */

public class HIContext {

    private WebView webView;
    private final Activity activity;
    private String id;
    public static Object value;
    boolean returnReady = false;
    static final Object lock = new Object();
    private String strVal;


    HIContext(WebView webView, Activity a, String id) {
        this.webView = webView;
        this.activity = a;
        this.id = id;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public String getParameter(String param) {
        System.out.println("Param to get from JS: " + param);
        String template = "javascript:getProperty('%s', '%s')";
        String loadUrl = String.format(template, this.id, param);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
//                webView.loadUrl(loadUrl);
                webView.evaluateJavascript(loadUrl, new ValueCallback<String>() {
                            @Override
                            public void onReceiveValue(String s) {
                                System.out.println("Value " + s);
                                strVal = s;
                                //the only thing that can be done
//                                Toast t = Toast.makeText(activity, "Series point: " + s, Toast.LENGTH_SHORT);
//                                t.show();
                            }
                        }
                );
            }
        };
        webView.post(runnable);
//        activity.runOnUiThread(runnable);
        System.out.println("Just before return: " + strVal);


        return strVal;
    }
}
