package com.obsqura.Training.Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Manager m=new Manager(30000,5000,2000);
		int mngr=m.calculateSalary();
		System.out.println("SALARY FOR MANAGER :"+mngr);
		int mnbn=m.calculateBonous();
		System.out.println("BONOUS FOR MANAGER : "+mnbn);
		Accountant ac=new Accountant(25000,2500,1000);
		int acnt=ac.calculateSalary();
		System.out.println("SALARY FOR ACCOUNTANT : "+acnt);
		int acntbn=ac.calculateBonous();
		System.out.println("BONOUS FOR ACCOUNTANT : "+acntbn);
		
		
		
	
		
		
		
		
		
		
		

	}

}
