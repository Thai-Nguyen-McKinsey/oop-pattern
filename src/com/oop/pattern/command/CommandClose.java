package com.oop.pattern.command;

class CommandClose implements Command {
	
    private Closeable receiver;
    
    CommandClose(Closeable receiver) {
        this.receiver = receiver;
    }
    
    public void execute() {
        this.receiver.close();
    }

}