package com.obsqura.Training.Inheritance;

public class SquareCl extends RectangleCl {
	
	public void printSqr()
	{
		
	System.out.println("SQUARE IS A RECTANGLE");	
		
	}
	
	public static void main(String args[])
	{
		
		SquareCl s=new SquareCl();
	s.printShape();	
	s.printRect();
	s.printSqr();
	CircleCl c=new CircleCl();
	c.printShape();
	
	RectangleCl r=new RectangleCl();
	r.printShape();
	r.printRect();
	}
	
	
	

}
