package com.uno.carrer;

import java.util.ArrayList;

class Book{
	int id;
	String name;
	String author;
	int price;
	int discount;
	public Book(int id, String name, String author, int price, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
public class BookStore {

	public static void main(String[] args) {
		
		ArrayList<Book>BookList=new ArrayList<Book>();
		
		Book b1=new Book(180,"Book","Arun Tiwari",800,10);
		
		Book b2=new Book(181,"Book","Ruskin Bond",120,0);
		
		Book b3=new Book(182,"Book","Roy Arundhati",300,30);
		
		Book b4=new Book(183,"Book","Joseph Murphy",120,10);
		
		BookList.add(b1);
		BookList.add(b2);
		BookList.add(b3);
		BookList.add(b4);
		
		System.out.println("Name\tAuthor\t\tPrice\tDiscount");
		Book eachBook = null;
		for(int i=0;i<BookList.size();i++) {
			eachBook = BookList.get(i);
			
			System.out.println(eachBook.getName()+"\t"+eachBook.getAuthor()+"\t"+eachBook.getPrice()+"\t"+
					eachBook.getDiscount());
		}
		
		System.out.println("\n\n Book 10% DisCount Details");
		displayBook(BookList,"Book",10);
		
		
	}//main
		
		
		static void displayBook(ArrayList<Book> pList,String pName,int dis){
			
			Book oneBook = null;
			
			System.out.println("Name\tAuthor\t\tPrices\tDiscount");
					
			for(int i=0;i<pList.size();i++) {
				oneBook = pList.get(i);
				
				if(oneBook.getName().equalsIgnoreCase(pName)) {//
					if(oneBook.getDiscount() >= dis) {
	System.out.println(oneBook.getName()+"\t"+oneBook.getAuthor()+"\t"+oneBook.getPrice()+"\t"+
													
    oneBook.getDiscount());		
					}
				}
			
			}//for
	
	}

}
