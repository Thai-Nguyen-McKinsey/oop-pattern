package com.oop.pattern.bridge;

public interface Dress {
	
	public String name();
}


class Suit implements Dress {
	public Suit() {};

	@Override
	public String name() {
		return "Suit";
	}
}

class Shirt implements Dress {
	public Shirt() {};
	
	@Override
	public String name() {
		return "Shirt";
	}
}