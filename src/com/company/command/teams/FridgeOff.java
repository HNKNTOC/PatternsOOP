package com.company.command.teams;

import com.company.command.items.Fridge;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class FridgeOff implements Command {
    Fridge fridge;

    public FridgeOff(Fridge fridge) {
        this.fridge = fridge;
    }

    @Override
    public void execute() {
        fridge.off();
    }

    @Override
    public void undo() {
        fridge.on(-25);
    }
}
