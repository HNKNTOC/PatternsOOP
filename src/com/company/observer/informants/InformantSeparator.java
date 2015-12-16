package com.company.observer.informants;

/**
 * Created by HNKNTOC on 15.12.2015.
 */
public class InformantSeparator extends Informant {

    public InformantSeparator() {
        name="InformantSeparator";
    }

    @Override
    public void update(String s) {
        String[] strings = s.trim().split(" ");
        for (String s1:strings) {
            print(s1);
        }
    }
}
