package com.company.command.teams;

import com.company.command.items.Lamp;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class LampOff implements Command {

    private Lamp lamp;

    public LampOff(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.off();
    }

    @Override
    public void undo() {
        lamp.on();
    }
}
