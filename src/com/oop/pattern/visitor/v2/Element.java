package com.oop.pattern.visitor.v2;

public interface Element {
	public void print();
}

class Xml implements Element {
	@Override
	public void print() {
		System.out.println("XML data <xml/>");
	}
	
}


class Json implements Element {
	@Override
	public void print() {
		System.out.println("Json data { key: \"value \"} ");
	}
}