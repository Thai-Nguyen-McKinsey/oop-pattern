package com.oop.pattern.proxy;

public class Component implements Core {
	
	public Component() {
		System.out.println("Loading ...");
	}

	@Override
	public void run() {
		System.out.println("Run !");
	}
	

}
