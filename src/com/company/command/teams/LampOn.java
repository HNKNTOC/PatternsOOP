package com.company.command.teams;

import com.company.command.items.Lamp;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class LampOn implements Command {
    private Lamp lamp;

    public LampOn(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.on();
    }

    @Override
    public void undo() {
        lamp.off();
    }
}
