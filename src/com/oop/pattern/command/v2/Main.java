package com.oop.pattern.command.v2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker hub = new Invoker();
		
		
		File file = new File("Text file");
		

		
		
		FileOpen openfileA = new FileOpen(file);
		hub.execute(openfileA);
		
		FileClose openfileB = new FileClose(file);
		hub.execute(openfileB);
		
		
	}

}
