package com.company.observer;

import java.util.ArrayList;

/**
 * Created by HNKNTOC on 15.12.2015.
 */
public interface Subject {
    ArrayList<ObserverReceiver> OBSERVER_RECEIVERS = new ArrayList<>();
    void attach(ObserverReceiver or);
    void detach(ObserverReceiver or);
}
