package com.oop.pattern.visitor;

public abstract class Print implements Visitable {
	
    protected String message="Your delivery arrived";
    
    abstract public String generateContent(); 
    abstract public void send();
}