package com.oop.pattern;

public class SingletonService {

	private static SingletonService instance;
	
	private SingletonService() {};
	
	public static SingletonService getInstance() {
		 if(instance == null){
            synchronized(SingletonService.class){
                if(instance == null){
                   instance = new SingletonService();
                }
            }
        }
        return instance;
	}
}
