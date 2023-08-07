package com.oop.pattern.facade;

public class EmailServer  {

	public void on() {
		System.out.println("Init Database connection");
	}

	public void off() {
		System.out.println("Close Database connection");
	}

}
