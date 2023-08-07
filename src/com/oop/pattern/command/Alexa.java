package com.oop.pattern.command;

public class Alexa{
    enum UserAction {
        CLOSE_DOOR,
        OPEN_DOOR,
        TURN_ON_LIGHT,
        TURN_OFF_LIGHT,
        TURN_ON_MY_LAPTOP,
        TURN_OFF_MY_LAPTOP,
        TURN_ON_YOUR_LAPTOP,
        TURN_OFF_YOUR_LAPTOP
    }
    
    private Door ourDoor = new Door(2);
    private Light ourLight = new Light("LED");
    private Laptop myLaptop = new Laptop("mac");
    private Laptop yourLaptop = new Laptop("DELL");

    Alexa() {}

    public void executeUserAction(int a) throws Exception {
    	
        UserAction action = UserAction.values()[a];
        Command c = null;
        
        switch(action){
            case CLOSE_DOOR:
                c = new CommandClose(this.ourDoor);
                // store to history or further processing with `c`
                // undo or ...
                break;
            case OPEN_DOOR:
                c = new CommandOpen(this.ourDoor);
                break;
            case TURN_ON_LIGHT:
                c = new CommandTurnOn(this.ourLight);
                break;
            case TURN_OFF_LIGHT:
                c = new CommandTurnOff(this.ourLight);
                break;
            case TURN_ON_MY_LAPTOP:
                c = new CommandTurnOn(this.myLaptop);
                break;
            case TURN_OFF_MY_LAPTOP:
                c = new CommandTurnOff(this.myLaptop);
                break;
            case TURN_ON_YOUR_LAPTOP:
                c = new CommandTurnOn(this.yourLaptop);
                break;
            case TURN_OFF_YOUR_LAPTOP:
                c = new CommandTurnOff(this.yourLaptop);
                break;
            default:
                throw new Exception("Alexa does not support action "+ c.toString());
        }
        if (c != null){
            c.execute();
        }
    }
    
}