package com.highsoft.highcharts.core;

import android.content.Context;
import android.util.Log;
import android.util.TypedValue;

class HICustomFont {

    private String fontStyle = "";

    //todo errors handling
    public boolean addFont(Context context, int id) {
        String TAG = "Highcharts";
        if(id == 0){
            Log.e(TAG, "Font resource can't be found.");
            return false;
        }
        else if(!context.getResources().getResourceTypeName(id).equals("font")) {
            Log.e(TAG, "Resource is not a font type!");
            return false;
        }
        String fontName = context.getResources().getResourceEntryName(id);
        TypedValue value = new TypedValue();
        context.getResources().getValue(id, value, true);
        String path = value.string.toString();
        String name = path.substring(path.lastIndexOf("/")+1, path.length());
        String fontFaceTemplate = "<style type=\"text/css\">@font-face { font-family: '%s'; src: url('file:///android_res/font/%s'); } </style>";
        this.fontStyle = this.fontStyle + String.format(fontFaceTemplate, fontName, name);
        Log.i(TAG, "FontStyle: " + this.fontStyle);
        return true;
    }

    public String getFont() {
        return this.fontStyle;
    }
}
