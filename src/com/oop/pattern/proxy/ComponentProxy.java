package com.oop.pattern.proxy;

public class ComponentProxy implements Core {
	private static Component component;
	
	@Override
	public void run() {
		if (component == null) {
			component = new Component();
		}
		component.run();
	}

}
