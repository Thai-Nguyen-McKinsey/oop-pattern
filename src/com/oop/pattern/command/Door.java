package com.oop.pattern.command;

// Receiver, logic happend here 
public class Door implements Closeable,Openable {
	
    private int numberOfGate = 2;
    
    public Door(int numberOfGate) {
        this.numberOfGate = numberOfGate;
    }

    public void close() {
        this.closeDoor();
    }

    public void open() {
        this.openDoor();
    }

    public void closeDoor(){
        System.out.println("Close left!" );
        System.out.println("Close right!" );
    }

    public void openDoor(){
        System.out.println("Open left!" );
        System.out.println("Open right!" );
    }
}