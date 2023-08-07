package com.oop.pattern.proxy;

public class Main {

	public static void main(String[] args) {
		Core c = new ComponentProxy();
		c.run();
		
		c.run();
	}

}
