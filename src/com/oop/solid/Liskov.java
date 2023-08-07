package com.oop.solid;

public class Liskov {
	public static void main(String[] args) {
		StaffService s = new StaffService();
		
		Staff st = new Staff();
		Dev dev = new Dev();
		QA qa = new QA();

		s.operation(st);
		s.operation(dev);
		s.operation(qa);
		
		s.codeProject(dev);
	}
}


//===============================================

class StaffService {
	
	public StaffService() {};
	
	public void operation(Staff st) {
//		do many thing 
//		....
		
		st.work();
	}
	
	
	public void codeProject(Dev dev) {
		System.out.print("Only for dev: ");
		dev.work();
	}
}


//===== MODELS

class Staff {
	public Staff() {};
	
	public void work() {
		System.out.println("Working");
	}
}

class Dev extends Staff {
	public void work() {
		System.out.println("Coding");
	}
}

class QA extends Staff {
	public void work() {
		System.out.println("Testing");
	}
}