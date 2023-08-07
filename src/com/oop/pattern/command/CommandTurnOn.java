package com.oop.pattern.command;

class CommandTurnOn implements Command {
	
    private TurnOnable receiver;
    
    CommandTurnOn(TurnOnable receiver) {
        this.receiver = receiver;
    }
    
    public void execute() {
        this.receiver.turnOn();
    }
}