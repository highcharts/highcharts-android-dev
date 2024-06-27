package com.highsoft.highcharts.core;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import java.util.List;

/** This class provides communication with web browser and exporting module **/

final class HIGWebViewClient extends WebViewClient{


    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
    }

    /** Method for opening credits in the web browser for older API **/
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(url != null && url.startsWith("http://")){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            webIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            PackageManager packageManager = view.getContext().getPackageManager();
            List activities = packageManager.queryIntentActivities( webIntent, PackageManager.MATCH_ALL);
            boolean isIntentSafe = activities.size() > 0;
                view.getContext().startActivity(webIntent);
            return isIntentSafe;
        }
        return false;
    }

    /** Method for opening credits in the web browser for newer API **/
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        if(request.getUrl() != null && request.getUrl().toString().startsWith("http://")){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(request.getUrl().toString()));
            webIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            PackageManager packageManager = view.getContext().getPackageManager();
            List activities = packageManager.queryIntentActivities( webIntent, PackageManager.MATCH_ALL);
            boolean isIntentSafe = activities.size() > 0;
            if(isIntentSafe){
                view.getContext().startActivity(webIntent);
                return true;
            }
            return false;
        }
        return false;
    }

    

}
