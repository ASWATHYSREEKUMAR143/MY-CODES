package com.obsqura.Training.Encapsulation;

public class Bank {
	
	private int pin;

	public void getPin() 
	{
		switch(pin)
		{
		case 1001:
			
			System.out.println("VALID PIN");
			break;
			
		case 1234:
			
			System.out.println("VALID PIN");
			break;
			
		case 1212:
			System.out.println("VALID PIN");
			break;
			
			default:
				System.out.println("INVALID PIN");
		
		}
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
