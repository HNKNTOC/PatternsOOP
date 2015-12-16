package com.company.observer;

/**
 * Receiver сообщает всем своим слушателям информацию.
 */
public class Receiver implements Subject {

    public void setString(String s){
        for(ObserverReceiver or:OBSERVER_RECEIVERS){
            or.update(s);
        }
    }

    @Override
    public void attach(ObserverReceiver or) {
        OBSERVER_RECEIVERS.add(or);
    }

    @Override
    public void detach(ObserverReceiver or) {
        OBSERVER_RECEIVERS.remove(or);
    }
}
