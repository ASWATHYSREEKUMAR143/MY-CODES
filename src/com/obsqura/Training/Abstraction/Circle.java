package com.obsqura.Training.Abstraction;

public class Circle extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		
		c.display();

	}

	@Override
	void display() {
		System.out.println("circle");
		
	}
	


}
