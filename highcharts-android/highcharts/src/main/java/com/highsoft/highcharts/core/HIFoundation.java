package com.highsoft.highcharts.core;

import android.util.Log;

import com.highsoft.highcharts.common.HIChartsJSONSerializable;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;

//todo add docs
public abstract class HIFoundation extends Observable {

    private final String TAG = "HIFoundation";

    protected String uuid;
    protected Map<String, Object> jsClassMethod;

    protected HIFoundation() {
        this.uuid = UUID.randomUUID().toString();
    }

    protected Observer updateObserver = new Observer() {
        @Override
        public void update(Observable o, Object arg) {
            setChanged();
            if (arg instanceof Map) {
                notifyObservers(arg);
            } else notifyObservers();
        }
    };

    // todo uncomment after parser update
//    protected abstract Map<String, Object> getParams();
    // remove observers .. ?
}
