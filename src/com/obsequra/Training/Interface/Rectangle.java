package com.obsequra.Training.Interface;

public class Rectangle implements Polygon {
	
	
	public void getArea(int l,int b)
	{	
	int a=l*b;
	System.out.println("AREA OF RECTANGLE : "+a);
		
		
	}
	public static void main(String args[])
	{

		Rectangle r=new Rectangle();
		r.getArea(10,20);
		
		
	}
	
	

}
