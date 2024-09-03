package com.highsoft.highcharts.core;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;

class HICustomFont {

    private String fontStyle = "";

    public boolean addFont(Context context, int id) {
        String TAG = "Highcharts";

        if (context == null) {
            Log.e(TAG, "Context is null.");
            return false;
        }

        if (id <= 0) {
            Log.e(TAG, "Invalid font resource ID.");
            return false;
        }

        try {
            if (!context.getResources().getResourceTypeName(id).equals("font")) {
                Log.e(TAG, "Resource is not a font type!");
                return false;
            }

            String fontName = context.getResources().getResourceEntryName(id);
            TypedValue value = new TypedValue();
            context.getResources().getValue(id, value, true);

            if (value.string == null) {
                Log.e(TAG, "Font resource path is null.");
                return false;
            }

            String path = value.string.toString();
            String name = path.substring(path.lastIndexOf("/") + 1);

            String fontFaceTemplate = "<style type=\"text/css\">@font-face { font-family: '%s'; src: url('file:///android_res/font/%s'); } </style>";
            this.fontStyle += String.format(fontFaceTemplate, fontName, name);

            Log.i(TAG, "FontStyle: " + this.fontStyle);
            return true;
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Font resource not found: " + e.getMessage());
        } catch (Exception e) {
            Log.e(TAG, "An unexpected error occurred: " + e.getMessage());
        }
        return false;
    }

    public String getFont() {
        return this.fontStyle;
    }
}
