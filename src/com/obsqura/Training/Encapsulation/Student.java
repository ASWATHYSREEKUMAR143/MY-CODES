package com.obsqura.Training.Encapsulation;

public class Student {
	
	String name;
	int rollnmbr;
	Address address;
	
	public Student(String name, int rollnmbr, Address address) {
		super();
		this.name = name;
		this.rollnmbr = rollnmbr;
		this.address = address;
	}
	
	void display()
	{
	System.out.println(name+" "+rollnmbr);
	System.out.println(address.city+" "+address.pin+" "+address.state);
		
		
	}
	

	public static void main(String[] args) {
	Address ad1=new Address("alappuzha",689520,"kerala");
	Address ad2=new Address("kottayam",6541,"kerala");
	
	Student s1=new Student("Aswathy",112,ad1);
	Student s2=new Student("Rohit",115,ad2);
	
	s1.display();
	s2.display();

	}

}
