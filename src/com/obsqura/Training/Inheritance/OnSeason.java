package com.obsqura.Training.Inheritance;

import java.util.Scanner;

public class OnSeason {
	int puramnt;
	
	public void discount()
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER THE PURCHASE AMOUNT:");
    puramnt=sc.nextInt();
	
	int discnt=puramnt-puramnt*40/100;
	
	
	System.out.println("AMOUNT AFTER 40% DISCOUNT IN ONSEASON IS : "+discnt);

	}

}
