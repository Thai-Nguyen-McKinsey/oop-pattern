package com.oop.exercise;


public class Main {
	public static void main(String[] args) {
		// OPEN 
		DAOService service = new DAOService();
		
		service.saveData();
		
	}
}




//===============================================


// CLOSED 
class DAOService {
	MySqlConnection database = new MySqlConnection();
	
	public DAOService() {} ;
	
	public Data saveData() {
		Data data = new Data();
		
		database.save();
		return data;
	}
}


class MySqlConnection {
	public void save() {
		System.out.println("Save to MySQL database");
	}
}

class OracleConnection {
	public void save() {
		System.out.println("Save to Oracle database");
	}
}



