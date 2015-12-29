package com.company.command;

import com.company.command.items.CoffeeMaker;
import com.company.command.items.Fridge;
import com.company.command.items.Lamp;
import com.company.command.items.RecordPlayer;
import com.company.command.teams.*;


/**
 * Created by HNKNTOC on 29.12.2015.
 */
public class Client {

    private Command[][] commands = new Command[4][2];
    private Command thisCommand;

    public void start(){
        Lamp lamp = new Lamp();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Fridge fridge = new Fridge();
        RecordPlayer recordPlayer = new RecordPlayer();

        commands[0][1] = new LampOn(lamp);
        commands[0][0] = new LampOff(lamp);
        commands[1][1] = new NoCommand();
        commands[1][0] = new NoCommand();
        commands[2][1] = new FridgeOn(fridge);
        commands[2][0] = new FridgeOff(fridge);
        commands[3][1] = new RecordPlayerOn(recordPlayer);
        commands[3][0] = new RecordPlayerOff(recordPlayer);

        go();

        System.out.println(lamp);
        System.out.println(coffeeMaker);
        System.out.println(fridge);
        System.out.println(recordPlayer);

    }

    private void go() {
        commands(0,1);
        commands(2,1);
        commands(3,1);

        commands(2,0);
        commands(1,1);
        commands(0,0);

        undo();
    }

    public void undo(){
        thisCommand.undo();
    }

    public void commands(int i,int z){
        commands[i][z].execute();
        thisCommand = commands[i][z];
    }
}
