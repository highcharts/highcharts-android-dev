package com.highsoft.highcharts.Common;

import java.util.LinkedList;
import java.util.Map;

/** The stops is an LinkedList of position and HIColor, position is a float between 0 and 1 assigning the relative position in the gradient, HIColor is the desired color. **/
public class HIStop extends LinkedList<Object>{
    
    public HIStop(double position, HIColor color) {
        if(position < 0 || position > 1){
            throw new IllegalArgumentException("Position of the gradient must be in 0 - 1 range");
        } else this.add(position);
        if(color.getData() instanceof Map){
            throw new IllegalArgumentException("Color for stops can't be gradient");
        } else this.add(color.getData());
    }
}
