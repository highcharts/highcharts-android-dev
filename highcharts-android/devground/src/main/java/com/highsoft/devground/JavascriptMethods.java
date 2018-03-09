package com.highsoft.devground;

import android.app.Activity;
import android.app.AlertDialog;
import android.webkit.JavascriptInterface;

/**
 * Created by bartosz on 06.03.18.
 */

public class JavascriptMethods {

    private String xd = "XD";
    private Activity activity;

    public JavascriptMethods(Activity activity) {
        this.activity = activity;
    }

    @JavascriptInterface
    public void testMethod(){
        String msg = "HAHAHA";
        System.out.println("Hello from JS!!! " + msg);
    }

    @JavascriptInterface
    public void createDialog(final int val){
        System.out.println("Object get toString: " + val);
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new AlertDialog.Builder(activity)
                        .setTitle("Clicked value:")
                        .setMessage(String.valueOf(val))
                        .create().show();
            }
        });

    }
}
