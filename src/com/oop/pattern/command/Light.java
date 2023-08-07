package com.oop.pattern.command;

// Receiver, logic happend here 
public class Light implements TurnOnable, TurnOffable {
	
    private String type;
     
    public Light(String type) {
        this.type = type;
    }

    public void turnOn() {
        this.turnLightOn();
    }

    public void turnOff() {
        this.turnLightOff();
    }

    public void turnLightOff() {
        System.out.println("Turn off " + type + " light!" );
    }

    public void turnLightOn() {
        System.out.println("Turn On " + type +" light!" );
    }
    
}