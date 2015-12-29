package com.company.command.items;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class RecordPlayer implements Item {

    private boolean inclusion;
    private boolean CD;
    private int volume;

    public void on(int volume){
        inclusion = true;
        this.volume = volume;
    }

    public void startCD(){
        CD=true;
    }

    public void stopCD(){
        CD=false;
    }

    public void off(){
        inclusion = false;
        volume = 0;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String toString() {
        return "RecordPlayer{" +
                "inclusion=" + inclusion +
                ", CD=" + CD +
                ", volume=" + volume +
                '}';
    }
}
