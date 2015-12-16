package com.company.observer;

import com.company.observer.informants.Informant;
import com.company.observer.informants.InformantSeparator;

/**
 * Проверка работы
 */
public class MainObserver {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Informant informant = new Informant();
        Informant infoSeparator = new InformantSeparator();

        receiver.attach(informant);
        receiver.attach(infoSeparator);


        receiver.setString("Test");
        receiver.setString("Test");
        receiver.setString("Test");
        receiver.setString("Hello world!");

    }
}
