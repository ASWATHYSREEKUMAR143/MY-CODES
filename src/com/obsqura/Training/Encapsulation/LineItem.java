package com.obsqura.Training.Encapsulation;

public class LineItem {
	
	int qun;
	Product pr;
	
	public LineItem(int qun,Product pr)
	{
	this.qun=qun;
	this.pr=pr;
		
		
	}
	
	public void display()
	{
	System.out.println("Name : "+pr.name+" "+"Discription : "+pr.discr+" "+"Product ID: "+pr.id);
	System.out.println("Quantity: "+qun);
			
	}
	
	
	

	public static void main(String[] args) {
		Product p=new Product("Narzo 30 pro","Mobile phone,5G,6GB RAM,Android version-11",21156943);
		Product p1=new Product("JBL Tune 510BT","Head phone,wireless,with mic",3487621);
		LineItem l=new LineItem(12,p);
		LineItem l1=new LineItem(20,p1);
		
		l.display();
		l1.display();

	}

}
