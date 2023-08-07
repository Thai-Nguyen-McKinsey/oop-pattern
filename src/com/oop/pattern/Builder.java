package com.oop.pattern;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Package pack = new Package().attachModuleA("A").attachModuleB("B").attachModuleC("C").attachModuleD("D");
		System.out.println(pack);
	}

}


class Package {
	private String moduleA;
	private String moduleB;
	private String moduleC;
	private String moduleD;
	
	public Package() {}

	public Package(String moduleA, String moduleB, String moduleC, String moduleD) {
		this.moduleA = moduleA;
		this.moduleB = moduleB;
		this.moduleC = moduleC;
		this.moduleD = moduleD;
	};
	
	public Package(String moduleA) {
		this.moduleA = moduleA;
	}
	
	public Package(String moduleA, String moduleD) {
		this.moduleA = moduleA;
		this.moduleD = moduleD;
	}
	
	public Package(String moduleB, String moduleC, String moduleD) {
		this.moduleB = moduleB;
		this.moduleC = moduleC;
		this.moduleD = moduleD;
	}
	
	
	// ---------------------------------------------
	
	public Package attachModuleA(String moduleA) {
		this.moduleA = moduleA;
		return this;
	}
	
	public Package attachModuleB(String moduleB) {
		this.moduleB = moduleB;
		return this;
	}
	
	public Package attachModuleC(String moduleC) {
		this.moduleC = moduleC;
		return this;
	}
	
	public Package attachModuleD(String moduleD) {
		this.moduleD = moduleD;
		return this;
	}
}