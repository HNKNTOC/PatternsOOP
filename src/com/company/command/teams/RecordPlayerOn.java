package com.company.command.teams;

import com.company.command.items.RecordPlayer;

/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class RecordPlayerOn implements Command {
    private RecordPlayer recordPlayer;

    public RecordPlayerOn(RecordPlayer recordPlayer) {
        this.recordPlayer = recordPlayer;
    }

    @Override
    public void execute() {
        recordPlayer.startCD();
        recordPlayer.on(20);
    }

    @Override
    public void undo() {
        recordPlayer.stopCD();
        recordPlayer.off();
    }
}
