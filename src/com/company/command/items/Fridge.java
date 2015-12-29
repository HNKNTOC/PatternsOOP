package com.company.command.items;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class Fridge implements Item {
    private boolean inclusion;
    private double temp;

    public void on(int temp){
        inclusion = true;
        this.temp = temp;
    }

    public void off(){
        inclusion = false;
        temp = 0.0;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "inclusion=" + inclusion +
                ", temp=" + temp +
                '}';
    }
}
