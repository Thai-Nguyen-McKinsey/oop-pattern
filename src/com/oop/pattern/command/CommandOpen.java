package com.oop.pattern.command;

class CommandOpen implements Command {
	
    private Openable receiver;
    
    CommandOpen(Openable receiver) {
        this.receiver = receiver;
    }
    
    public void execute(){
        this.receiver.open();
    }
}