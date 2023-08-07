package com.oop.pattern;

public class Main1 {

	public static void main(String[] args) {
		NormalService n1 = new NormalService();
		NormalService n2 = new NormalService();
		System.out.println(n1 + " - " + n2);
		
		SingletonService s1 = SingletonService.getInstance();
		SingletonService s2 = SingletonService.getInstance();
		System.out.println(s1 + " - " + s2);

	}

}
