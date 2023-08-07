package com.oop.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProduct p1 = new Product("Product A", "Work A ");
		System.out.println(p1);
		
		
		IProduct dec1 = new TagDecor(p1);
		dec1.setFunction("");
		System.out.println(p1);
		
		IProduct dec2 = new BarcodeDecor(p1);
		dec2.setFunction("");
		System.out.println(p1);
	}

}
