package com.highsoft.devground;

import android.webkit.JavascriptInterface;

/**
 * Created by bartosz on 06.03.18.
 */

public class JavascriptMethods {

    @JavascriptInterface
    public void testMethod(){
        System.out.println("Hello from JS!!!");
    }
}
