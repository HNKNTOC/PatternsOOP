package com.company.command.teams;

import com.company.command.items.Fridge;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class FridgeOn implements Command {
    Fridge fridge;
    public FridgeOn(Fridge fridge) {
        this.fridge = fridge;
    }

    @Override
    public void execute() {
        fridge.on(-25);
    }

    @Override
    public void undo() {
        fridge.off();
    }
}
