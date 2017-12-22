package com.highsoft.highcharts.Common;

import java.util.LinkedList;
import java.util.Map;

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
