package com.oop.pattern.bridge;

public abstract class Person {
	protected Dress dress;
	
	public Person(Dress dress) {
		this.dress = dress;
	}
	
	public abstract String work();
}


class Student extends Person {

	public Student(Dress dress) {
		super(dress);
	}

	@Override
	public String work() {
		return "Learning & wear " + dress.name();
	}
}

class Teacher extends Person {

	public Teacher(Dress dress) {
		super(dress);
	}

	@Override
	public String work() {
		return "Teaching & wear " + dress.name();
	}
}