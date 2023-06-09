package org.sonnyjava.linkedlist;

import java.util.*;

public class ArrayToLinkedListAndBackward {

	public static void main(String[] args) {
		
		String[] simpleArray = { "One", "Two", "Three" };
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(simpleArray));
		System.out.println("*****************************************");
		
		//Convert to the LinkedList:
		LinkedList<String> newList = new LinkedList<String>(Arrays.asList(simpleArray));
		newList.add("Four");
		newList.addFirst("Zero");
		System.out.println("Here is the new LinkedList: ");
		
		System.out.println(newList);
		
		System.out.println("*****************************************");
		
		//Now let convert newList back to the Array:
		System.out.println("Convert back to an Array with new items in it: ");
		simpleArray = newList.toArray(new String[newList.size()]);
		System.out.println(Arrays.toString(simpleArray));
		

	}

}
