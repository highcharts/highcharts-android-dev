package com.highsoft.highcharts.Core;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.JavascriptInterface;

/**
 * Created by bartosz on 09.03.18.
 */

public class HIFunctionalInterface {
    private Runnable runnable;
    public HIFunctionalInterface(Runnable runnable) {
        this.runnable = runnable;
    }

//    @RequiresApi(api = Build.VERSION_CODES.N)
    @JavascriptInterface
    public void androidHandler(){
//        System.out.println("Value: " + this.val);
//        function.accept(this.val);
        this.runnable.run();
    }

}
