package com.oop.solid;


//@RestController 
public class SingleController {
	
	DataService service = new DataService();


//	@GetMapping("/person/{id}")
	public Data getData(String id) {
		
		Data data = service.getData(id);
		

		return data;
	}
}





// ===============================================

class Data {
	public Data() {} 
}

class DataService {
	public DataService() {};
	
	public Data getData(String param) {
		Data data = new Data();
		
		/**
		make connection 
		build query 
		run query from database 
		set return data to data object 
		....
		**/
		
		return data;
	}
}
