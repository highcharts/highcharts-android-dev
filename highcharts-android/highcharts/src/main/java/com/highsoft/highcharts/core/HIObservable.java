package com.highsoft.highcharts.core;

import java.util.Observable;
import java.util.Observer;

public class HIObservable extends Observable {

    protected Observer updateObserver = new Observer() {
        @Override
        public void update(Observable observable, Object o) {
            setChanged();
            notifyObservers();
        }
    };
}
