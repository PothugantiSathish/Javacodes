package com.uno.carrer;

import java.util.ArrayList;

class Product{
	int id;
	String name;
	int price;
	String brand;
	int discount;
	public Product(int id, String name, int price, String brand, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
public class Amazon {

	public static void main(String[] args) {
		
		ArrayList<Product>PrdList=new ArrayList<Product>();
		
		Product P1 = new Product(205,"Mobile",15000,"Redmi",10);

		Product P2 = new Product(206,"Mobile",10000,"Realme",0);

		Product P3 = new Product(207,"Mobile",20000,"vivo",20);

		Product P4 = new Product(205,"Bike",100000,"Glammer",5);

		Product P5 = new Product(205,"Bike",200000,"Honda",12);

		Product P6 = new Product(205,"Bike",400000,"Pulsar",10);
		
		PrdList.add(P1);
		PrdList.add(P2);
		PrdList.add(P3);
		PrdList.add(P4);
		PrdList.add(P5);
		PrdList.add(P6);
	    
		System.out.println("Name\tPrice\tBrand\tDiscount");
		Product eachPrd = null;
		for(int i=0;i<PrdList.size();i++) {
			eachPrd = PrdList.get(i);
			
			System.out.println(eachPrd.getName()+"\t"+eachPrd.getPrice()+"\t"+eachPrd.getBrand()+"\t"+
			eachPrd.getDiscount());
		}
		
		System.out.println("\n\n Mobile 5% DisCount Details");
		displayproducts(PrdList,"Mobile",5);
		
		System.out.println("\n\n Bike 5% DisCount Details");
		displayproducts(PrdList,"Bike",10);
		
		System.out.println("\n\n Bike No DisCount Details");
		displayproducts(PrdList,"Bike",0);
		
		System.out.println("\n\n Mobile No DisCount Details");
		displayproducts(PrdList,"Mobile",0);
	}//main
		
		
		static void displayproducts(ArrayList<Product> pList,String pName,int dis){
			
			Product onePrd = null;
			
			System.out.println("Name\tPrice\tBrand\tDiscount");
					
			for(int i=0;i<pList.size();i++) {
				onePrd = pList.get(i);
				
				if(onePrd.getName().equalsIgnoreCase(pName)) {//
					if(onePrd.getDiscount() >= dis) {
	System.out.println(onePrd.getName()+"\t"+onePrd.getPrice()+"\t"+onePrd.getBrand()+"\t"+
													
	onePrd.getDiscount());		
					}
				}
			
			}//for
	}

}
