package com.obsqura.Training.Inheritance;

public class Rectangle {
	
	double length,breadth;
	
	public Rectangle(double length,double breadth)
	{
		
	this.length=length;
	this.breadth=breadth;
		
		
	}
	
	
	
	public void printArea()
	{
		
		
		double area=length*breadth;
		
		
		System.out.println("AREA OF RECTANGLE IS : "+area);
	}
	
	public void printPerimeter()
	{
		
		
		double peri=(length+breadth)/2;
		
		System.out.println("PERIMETER OF RECTANGLE IS : "+peri);
	}
		

}
