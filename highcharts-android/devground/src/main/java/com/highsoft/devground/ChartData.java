package com.highsoft.devground;

/**
 * Created by bartosz on 21.03.18.
 */

public class ChartData /*extends HashMap<String, Object>*/ {

//    public ChartData(Number x, Number y, HIMarker marker) {
//        put("x", x);
//        put("y", y);
//        if(marker != null){
//            put("marker", marker.getParams());
//        }
//    }
    public int realisasi_simplified;
    public String color;

    public ChartData(int realisasi_simplified, String color) {
        this.realisasi_simplified = realisasi_simplified;
        this.color = color;
    }
}