package com.oop.solid;

public class InterfaceSegregation {

}


interface IEmail {
	
	public void send();
	
	public void forward();
	
	public void reply();
	
//	public void printContent();
}

interface IDocument {
	
	public void printContent();
	
	public void formatContent();
}



class GmailEmail implements IEmail, IDocument {
	@Override
	public void send() {
		// TODO Auto-generated method stub
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
	}

	@Override
	public void reply() {
		// TODO Auto-generated method stub
	}

	@Override
	public void printContent() {
		// TODO Auto-generated method stub
	}

	@Override
	public void formatContent() {
		// TODO Auto-generated method stub
		
	}
}


class WordDocument implements IDocument {
	@Override
	public void printContent() {
		// TODO Auto-generated method stub
	}

	@Override
	public void formatContent() {
		// TODO Auto-generated method stub
		
	}
}

