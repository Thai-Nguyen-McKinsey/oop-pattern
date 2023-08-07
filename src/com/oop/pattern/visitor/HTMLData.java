package com.oop.pattern.visitor;

public class HTMLData extends Print {
	
    private String template="<h1>Hi _user<h1>, </br> <p>This is  _message</p>";

    @Override 
    public String generateContent(){
        // create json to fire webhook logic
        String userName = "SonLuu";
        return this.template.replaceAll("_message",this.message).replaceAll("_user",userName);
    }
    
    @Override
    public void send(){
        System.out.println("Print HTML with content: " + this.generateContent());
    }
    
    @Override 
    public void accept(ReportVisitor rv){
        rv.visitHTML(this);
    }
}