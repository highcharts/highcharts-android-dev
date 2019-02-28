package com.highsoft.highcharts.core;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;

public abstract class HIAbstractFoundation extends Observable {

    protected String uuid;
    protected Map<String, Object> jsClassMethod;

    protected HIAbstractFoundation() {
        this.uuid = UUID.randomUUID().toString();
    }

    protected Observer updateObserver = (observable, o) -> {
        setChanged();
        notifyObservers();
    };

    // remove observers .. ?
}
