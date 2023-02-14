package com.obsqura.Training.Inheritance;

public class Square extends Rectangle {
	
	double side;
	
	public Square(double side)
	{
		super(side,side);
		this.side=side;	
	}
	public void printAreaSq()
	{
	double a=side*side;
	System.out.println("AREA OF SQUARE IS : "+a);	
	}
	
	public void printPeriSq()
	{	
	double p=4*side;
	System.out.println("PERIMETER OF SQUARE IS : "+p);
		
	}
	
	public static void main(String args[])
	{
		
	Rectangle r=new Rectangle(20,30);	
	r.printArea();
	r.printPerimeter();
	
	Square s=new Square(40);
	s.printAreaSq();
	s.printPeriSq();
			
	}
	
}
