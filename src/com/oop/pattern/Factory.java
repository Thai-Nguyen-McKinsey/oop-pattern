package com.oop.pattern;

public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IItem i1 = Factory.createItem("B");
		IItem i2 = Factory.createItem("A");
		
		System.out.println(i1.toString() + " - " + i2.toString());
	}

	
	public static IItem createItem(String itemStr) {
		if (itemStr.equals("A")) {
			
			return new ItemA();
		}
		else if (itemStr.equals("B")) {
			return new ItemB();
		} 
		else {
			return null;
		}
	}
}

interface IItem {
	
}

class ItemA implements IItem {
	public String toString() {
		return "item A";
	}
}

class ItemB implements IItem {
	public String toString() {
		return "item B";
	}
}
