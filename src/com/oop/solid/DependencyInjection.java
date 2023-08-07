package com.oop.solid;

public class DependencyInjection {
	
	
	public static void main(String[] args) {
		
		BusinessService bs = new BusinessService(new VendorProduct());
//		BusinessService bs = new BusinessService(new LocalProduct());
		
		bs.getProductItem(1);
		
	}
	
//	 <bean id="BusinessService" class="com.oop.pattern.BusinessService">
//	     <constructor-arg>
//	         <bean class="com.oop.pattern.LocalProduct" />
//	     </constructor-arg>
//	 </bean>
	
}


class BusinessService {
	IProductService productService;
	
	public BusinessService(IProductService productService) {
		this.productService = productService;
	}
	
	public void getProductItem(int id) {
		productService.getItem(id);
	}
	
//	public void setService(IProductService productService) {
//	    this.productService = productService;
//	}
}



//===============================================


interface IProductService {
	public Object getItem(int id);
	public void createItem(Object obj);
}


class LocalProduct implements IProductService {
	@Override
	public Object getItem(int id) {
		System.out.println("Search record on local Database with id");
		return new Object();
	}

	@Override
	public void createItem(Object obj) {
		System.out.println("Create record on local Database");
	}
}


class VendorProduct implements IProductService {
	@Override
	public Object getItem(int id) {
		System.out.println("Request to 3rd party system for CHECKING product");
		return new Object();
	}

	@Override
	public void createItem(Object obj) {
		System.out.println("Request to 3rd party system for CREATING product");
	}
}






