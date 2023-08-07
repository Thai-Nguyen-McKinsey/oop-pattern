package com.oop.pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> cls = String.class;
		System.out.println(cls);
		String str = "";
		
		Child c = new Child();
		Class<? extends Parent> cls1 = c.getClass();
		System.out.println(cls1);
	}

}


class Parent {}

class Child extends Parent {
	public Child() {}
	
	public String toString() {
		return "child";
	}
}