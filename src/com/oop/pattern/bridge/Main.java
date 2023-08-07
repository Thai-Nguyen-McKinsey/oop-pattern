package com.oop.pattern.bridge;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Teacher(new Suit());
		System.out.println(p1.work());
		
		Person p2 = new Student(new Shirt());
		System.out.println(p2.work());

	}

}
