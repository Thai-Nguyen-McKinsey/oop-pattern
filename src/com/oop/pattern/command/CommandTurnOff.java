package com.oop.pattern.command;

class CommandTurnOff implements Command {
	
    private TurnOffable receiver;
    
    CommandTurnOff(TurnOffable receiver) {
        this.receiver = receiver;
    }
    
    public void execute() {
        this.receiver.turnOff();
    }
}