package com.oop.pattern.command.v2;

public class File {
	String name;
	
	public File(String name) {
		this.name = name;
	};
	
	public void close() {
		System.out.println("close: " + name);
	}
	
	public void open() {
		System.out.println("Open: " + name);
	}
}
