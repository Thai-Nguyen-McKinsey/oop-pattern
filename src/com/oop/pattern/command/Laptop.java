package com.oop.pattern.command;

// Receiver, logic happend here 

public class Laptop implements TurnOnable, TurnOffable  {
    private String brand = "HP";

    public Laptop(String brand){
        this.brand = brand;
    }

    public void turnOn() {
        this.turnLaptopOn();
    }
    
    public void turnOff() {
        this.turnLaptopOff();
    }

    public void turnLaptopOff( ){
        if (brand == "mac"){
            System.out.println("Apple > Shutdown" );
        }else{
            System.out.println("Windows > Shutdown" );
        }
    }

    public void turnLaptopOn() {
        System.out.println("Press power button" );
    }
}