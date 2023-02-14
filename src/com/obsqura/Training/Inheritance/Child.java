package com.obsqura.Training.Inheritance;

public class Child extends Parent {
	
	
	public void printChild()
	{
		
	System.out.println("THIS IS CHILD CLASS");	
		
	}
	
	
	public static void main(String args[])
	{
		
		Child c=new Child();
		Parent p=new Parent();
		
		p.printParent();
		
		c.printChild();
		c.printParent();
		
		
		
	}
	
	

}
