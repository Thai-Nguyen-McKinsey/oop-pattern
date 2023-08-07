package com.oop.pattern.decorator;

public class Product implements IProduct {

	private String name;
	private String function;
	
	public Product () {}
	
	

	public Product(String name, String function) {
		super();
		this.name = name;
		this.function = function;
	}

	public String getFunction() {
		return function;
	}

	@Override
	public String setFunction(String function) {
		this.function = function;
		return this.function;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", fucntion=" + function  + "]";
	}

}
