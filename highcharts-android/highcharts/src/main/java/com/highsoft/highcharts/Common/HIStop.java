package com.highsoft.highcharts.Common;

import java.util.LinkedList;
import java.util.Map;

/** The stops is an LinkedList of position and HIColor, position is a float between 0 and 1 assigning the relative position in the gradient, HIColor is the desired color. **/
public class HIStop extends LinkedList<Object>{

    /**
     *
     * @param position is in [0..1] range
     * @param color is the desired color, can't be gradient
     *
     * @exception IllegalArgumentException if a param does not comply
     */
    public HIStop(float position, HIColor color) {
        checkForRange(position, 0f, 1f);
        checkForGradient(color);
        this.add(position);
        this.add(color.getData());
    }

    private static void checkForRange(float pos, float lowR, float uppR){
        if(pos < lowR || pos > uppR)
            throw new IllegalArgumentException(pos + "must be in [" + lowR + ".." + uppR + "] range");
    }

    private static void checkForGradient(HIColor col){
        if(col.getData() instanceof Map)
            throw new IllegalArgumentException("color for stop can't be gradient");
    }
}
