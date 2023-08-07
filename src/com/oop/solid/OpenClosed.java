package com.oop.solid;


public class OpenClosed {
	public static void main(String[] args) {
		DAOService service = new DAOService(new OracleConnection());
		
		service.saveData();
		
	}
}




//===============================================

interface IConnection {
	public void save();
}

class DAOService {
	IConnection database;
	
	public DAOService() {} ;
	
	public DAOService(IConnection database) {
		this.database = database;
	};
	
	public Data saveData() {
		Data data = new Data();
		
		database.save();
		return data;
	}
}




class MySqlConnection implements IConnection  {
	public void save() {
		System.out.println("Save to MySQL database");
	}
}

class OracleConnection implements IConnection {
	public void save() {
		System.out.println("Save to Oracle database");
	}
}



