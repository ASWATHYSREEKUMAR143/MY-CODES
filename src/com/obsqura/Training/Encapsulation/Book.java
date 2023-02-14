package com.obsqura.Training.Encapsulation;

public class Book {
	
	String bkname;
	int price;
	Author a;
	
	public Book(String bkname,int price,Author a)
	{
	this.bkname=bkname;
	this.price=price;
	this.a=a;
		
		
	}
	
	public void display()
	{
		System.out.println("BOOK NAME : "+bkname);
	System.out.println("PRICE : "+"RS"+price);
	System.out.println("AUTHOR : "+a.name);
	System.out.println("AGE : "+a.age);
	System.out.println("PLACE : "+a.place);
		
	}
	
	public static void main(String[] args) {
		Author au=new Author("CHETAN BHAGATH",48,"NEW DELHI");
		
		Book b=new Book("ONE INDIAN GIRL",450,au);
		
		b.display();

	}
}
