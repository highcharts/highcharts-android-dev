package com.highsoft.highcharts.core;

import com.highsoft.highcharts.common.HIChartsJSONSerializable;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;

//todo add docs
public abstract class HIFoundation extends Observable implements HIChartsJSONSerializable {

    protected String uuid;
    protected Map<String, Object> jsClassMethod;

    protected HIFoundation() {
        this.uuid = UUID.randomUUID().toString();
    }

    protected Observer updateObserver = (observable, o) -> {
        setChanged();
        notifyObservers();
    };

    // remove observers .. ?
}
