package com.oop.pattern.visitor;

public class WordData extends Print {
	
    private String template="Hi _user, _greet. \n_message";


    private String greet(){
        // Random greetings + emojis,...
        return "Hope you have a nice day";
    }

    @Override 
    public String generateContent(){
        // create json to fire webhook logic
        String userName = "SonLuu";
        return this.template.replaceAll("_message",this.message).replaceAll("_user",userName).replaceAll("_greet",this.greet());
    }
    
    @Override
    public void send(){
        System.out.println("Print doc with content: " + this.generateContent());
    }

    @Override
    public void accept(ReportVisitor rv){
        rv.visitWord(this);
    }
}