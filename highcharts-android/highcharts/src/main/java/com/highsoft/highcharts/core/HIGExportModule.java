package com.highsoft.highcharts.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Bartosz on 31.08.2017.
 */

/**
 * This class is responsible for all chart export matters
 */
final class HIGExportModule implements DownloadListener {

    private final WebView webView;
    private Activity activity;
    private static int chosenMethod;

    HIGExportModule(Activity a, WebView webView) {
        this.activity = a;
        this.webView = webView;
    }

    @Override
    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
        String intentType = "image/png";
        String fileName = "img.png";
        try {
            if(url != null) {
                   /* switch(chosenMethod){
                        case 1:
                            fileName = "img.png";
                            intentType = "image/png";
                            break;
                        case 2:
                            fileName = "doc.pdf";
                            intentType = "application/pdf";
                            break;
                    }*/
                FileOutputStream fos;
                fos = activity.getApplicationContext().openFileOutput(fileName, Context.MODE_PRIVATE);
                String fileB64 = url.split(",")[1];
                byte[] decodedStr = Base64.decode(fileB64, Base64.NO_WRAP);
                fos.write(decodedStr);
                fos.getFD().sync();
                fos.flush();
                fos.close();
                Intent sendIntent = new Intent();
                sendIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_GRANT_READ_URI_PERMISSION);
                sendIntent.setAction(Intent.ACTION_SEND);
                File filePath = new File(String.valueOf(activity.getApplicationContext().getFilesDir()));
                File newFile = new File(filePath, fileName);
                sendIntent.putExtra(Intent.EXTRA_STREAM, FileProvider.getUriForFile(activity.getApplicationContext(), activity.getApplicationContext().getPackageName() + ".FileProvider", newFile));
                sendIntent.setType(intentType);
                activity.startActivity(sendIntent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @JavascriptInterface
    public void showDialog(){
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                webView.loadUrl("javascript: chart.exportChartLocal()");
            }
        });
       /* new AlertDialog.Builder(this.activity)
                .setTitle("Share chart as...")
                .setItems(new CharSequence[]{"Image", "PDF document", "Print"}, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0: chosenMethod = 1;
                            //img png
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    webView.loadUrl("javascript: chart.exportChartLocal()");
                                    Log.v("Dialog onClick()", "method chosen " + chosenMethod);
                                }
                            });
                                break;
                            case 1: chosenMethod = 2;
                            //pdf
                                activity.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        webView.loadUrl("javascript: chart.exportChartLocal( {type: 'application/pdf'})");
                                        Log.v("Dialog onClick()", "method chosen " + chosenMethod);
                                    }
                                });
                                break;
                            case 2: chosenMethod = 3;
                            //print
                                activity.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        webView.loadUrl("javascript: chart.print()");
                                        Log.v("Dialog onClick()", "method chosen " + chosenMethod);
                                    }
                                });
                                break;
                        }
                    }
                })
                .create().show();*/
    }
}
