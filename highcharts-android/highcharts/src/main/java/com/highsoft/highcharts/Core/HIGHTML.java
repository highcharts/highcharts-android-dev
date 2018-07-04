package com.highsoft.highcharts.Core;


import android.content.Context;
import android.content.res.AssetManager;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Map;

/**
 *  This is main class that operates on HTML, loading, parsing etc...
 */
final class HIGHTML implements Serializable{

    /**
     *  This is base URL path for bundle.
     */
    String baseURL;
    /**
     *  This is parsed HTML.
     */
    public String html;
    /**
     *  This is options object injected to WebView.
     */
    public String options;

    public String lang;

    public String global;

    private String html_tmp;
    public String scripts;
    private HIGJavaScript js;

    HIGHTML(WebView webView) {
        this.js = new HIGJavaScript(webView);
    }

    /**
     *  Loads html from location.
     *
     *  @param path to HTML file to load.
     */
    void loadHTML(Context context, String path) throws IOException {
        this.html_tmp = getContentsOfFile(context, path);
        this.html = html_tmp;
        this.scripts = "";
    }

    /**
     *  Prepare JS files to load name, prefix, suffix.
     *
     *  @param js  JS files names to load from bundle. egz. 'highchart'
     *  @param prefix JS files prefix default 'js/'
     *  @param suffix JS files suffix default '.js'
     */
    void prepareJavaScript(String js, String prefix, String suffix) {
        if (js == null) {
            return;
        }
        String template = "<script src=\"%s%s%s\"></script>\n";
        String jsFileName = String.format("%s%s%s", prefix, js, suffix);
        String jsFilePath = this.baseURL + jsFileName;
        File f = new File(jsFilePath);
        if(f.exists() && !f.isDirectory()) {
            System.out.println(String.format("[ Highcharts ]: %s, dont exists!", jsFileName));
            return;
        }

        this.scripts += String.format(template, prefix, js, suffix);
    }

    void prepareLang(Map lang){
        this.lang = this.js.JSObject(lang);
    }


    void prepareGlobal(Map global) {
        this.global = this.js.JSObject(global);
    }

    /**
     *  Prepare options Java object to JS representation.
     *
     *  @param options Map object.
     */
    void prepareOptions(Map options) {
        options = HIGDependency.addOptions(options);
        this.options = this.js.JSObject(options);
    }

    /**
     *  Prepare width and height in htm for proper display.
     *
     *  @param width for view.
     *  @param height for view.
     */
    void prepareViewWidth(Integer width, Integer height) {
        if(html_tmp.contains("{{height}}")) // added later
        this.html = this.html_tmp.replace("{{height}}", String.valueOf(height)).replace("{{width}}", String.valueOf(width));
    }

    /**
     *  Last step preparing HTML. After this get HTML from 'HTML' property.
     */
    void injectJavaScriptToHTML() {
        if(this.lang != null){
            this.html = this.html.replace("{{lang}}", this.lang);
        } else {
            this.html = this.html.replace("{{lang}}", "{ }");
        }
        if(this.global != null){
            this.html = this.html.replace("{{global}}", this.global);
        } else {
            this.html = this.html.replace("{{global}}", "{ }");
        }
        this.html = this.html
                .replace("{{script}}", this.scripts)
                .replace("{{options}}", this.options);
        System.out.println("GENERATED CHART OPTIONS\n" + this.options);
    }

    private String getContentsOfFile(Context context, String path) throws IOException {
        StringBuilder buf = new StringBuilder();

        AssetManager assetManager = context.getAssets();

        InputStream inputStream = assetManager.open(path);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            buf.append(str);
        }
        bufferedReader.close();
        return buf.toString();
    }

}

