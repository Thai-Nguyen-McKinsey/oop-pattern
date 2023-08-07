package com.oop.pattern.facade;

public class Main {
	
	public static void main(String[] args) {
		App app = new App();
		
		app.startApp();
		
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		app.stopApp();
	}
}
