package com.highsoft.highcharts.Common;

import java.util.Observer;

/**
 * Created by bartosz on 10.04.18.
 */

public interface HISubject {

    //--- Testing UPDATE feature --//
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
