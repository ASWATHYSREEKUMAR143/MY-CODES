package com.obsqura.Training.ArreyList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListColors {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("RED");
		list.add("ORANGE");
		list.add("YELLOW");
		list.add("GREEN");
		list.add("BLUE");
		
		System.out.println(list);  //printing the list
		
		System.out.println("IS GREEN PRESENT IN THE ARRAY LIST : "+list.contains("GREEN"));
		
		System.out.println(list.remove(2)); //Removing the 3rd element
		System.out.println(list);
		
		
		
		//String element=list.get(2); //Retrieve the element from index 2
		
		//System.out.println("ELEMENT IN THE 2ND INDEX IS : " +element);
		
		
		
		//Iterator<String> itr=list.iterator(); //Getting the iterator
		
		//while(itr.hasNext()) //check the iterator has element
		//{
		//System.out.println(itr.next());	  //printing  array list using iterator
			
		//}
		
		

	}

}
