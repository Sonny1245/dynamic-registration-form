package org.sonnyjava.arraysconversion;

import java.util.*;

public class ConversionOfArrayToArrayListCollections {

	public static void main(String[] args) {
		
		String[] myArray = {"One", "Two", "Three", "Four", "Five"};
		
		//Method 1: 
		List<String> myList = Arrays.asList(myArray);
		System.out.println("Method 1: " + myList);
		
		//Method 2: 
		List<String> myList2 = new ArrayList<String>();
		Collections.addAll(myList2,myArray);
		System.out.println("Method 2: "+ myList2);
		
		//Method 3: 
		List<String> myList3 = new ArrayList<String>();
		for(String text:myArray) {
			myList3.add(text);
		}
		
		System.out.println("Method 3: "+ myList3);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("All lists below are unpacked: ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		//Now let print out each list above:
		for(int i = 0; i < myList.size(); i++ ) {
			System.out.printf("%s ", myList2.get(i));
		}
		
	}

}
