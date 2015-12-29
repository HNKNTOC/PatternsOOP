package com.company.command.items;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class Lamp implements Item {

    private boolean inclusion;

    public void on(){
        inclusion = true;
    }

    public void off(){
        inclusion = false;
    }

    @Override
    public String getDescription() {
        return "This Lamp in main room.";
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "inclusion=" + inclusion +
                '}';
    }
}
