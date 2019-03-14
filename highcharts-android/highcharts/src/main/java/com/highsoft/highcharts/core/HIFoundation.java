package com.highsoft.highcharts.core;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;

/**
 * The very basic class which implement the crucial behaviours for HI objects in Highcharts Android
 */
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

    public abstract Map<String, Object> getParams();
    // ???????????????????
    // remove observers .. ?
}
