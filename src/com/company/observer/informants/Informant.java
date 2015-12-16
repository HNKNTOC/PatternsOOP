package com.company.observer.informants;

import com.company.observer.ObserverReceiver;

/**
 * ������� ���������� � �������.
 */
public class Informant implements ObserverReceiver {

    String name = "Informant";

    protected void print(String s){
        System.out.println(name+": "+s);
    }

    @Override
    public void update(String s) {
        print(s);
    }
}
