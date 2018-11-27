package com.highsoft.highcharts.core;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by bartosz on 19.03.18.
 */

final class HIGWebChromeClient extends WebChromeClient {

    public void onRequestFocus(WebView view){
        synchronized (this){
            this.notify();
        }
    }
}
