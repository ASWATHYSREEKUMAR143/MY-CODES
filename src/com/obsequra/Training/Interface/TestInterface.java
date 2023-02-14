package com.obsequra.Training.Interface;

public class TestInterface implements Printable, Printable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInterface i=new TestInterface();
		
		i.draw();
		

	}

	@Override
	public void draw() {
		
		System.out.println("Multiple inheritance achieved");
		// TODO Auto-generated method stub
		
	}

}
