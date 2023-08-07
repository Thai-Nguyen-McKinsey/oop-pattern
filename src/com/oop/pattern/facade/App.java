package com.oop.pattern.facade;

public class App {
	private Database db; 
	private EmailServer mailServer; 
	private MessageQueue queue; 
	private Redis redis; 
	
	public App() {
		db = new Database();
		mailServer = new EmailServer();
		queue = new MessageQueue();
		redis = new Redis();
	}

	public void startApp() {
		System.out.println("Start running app");
		db.on();
		mailServer.on();
		queue.on();
		redis.on();
	}
	
	public void stopApp() {
		System.out.println("Stop app");
		db.off();
		mailServer.off();
		queue.off();
		redis.off();
	}
}
