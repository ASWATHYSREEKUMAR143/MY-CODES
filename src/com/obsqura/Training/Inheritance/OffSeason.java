package com.obsqura.Training.Inheritance;

public class OffSeason extends OnSeason {

public void discount()
{
	super.discount();
  int d=puramnt-puramnt*15/100;

System.out.println("AMOUNT AFTER 15% DISCOUNT IN OFFSEASON IS: "+d);



}


public static void main(String args[]){
	
	OffSeason o=new OffSeason();
	o.discount();
	
	
}
}
