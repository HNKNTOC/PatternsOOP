package com.company.command.teams;

import com.company.command.items.RecordPlayer;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class RecordPlayerOff implements Command {

    private RecordPlayer recordPlayer;

    public RecordPlayerOff(RecordPlayer recordPlayer) {
        this.recordPlayer = recordPlayer;
    }

    @Override
    public void execute() {
        recordPlayer.stopCD();
        recordPlayer.off();
    }

    @Override
    public void undo() {
        recordPlayer.on(20);
        recordPlayer.stopCD();
    }
}
