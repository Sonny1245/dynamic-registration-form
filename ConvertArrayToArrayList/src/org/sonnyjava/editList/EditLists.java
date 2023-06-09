package org.sonnyjava.editList;

import java.util.*;

public class EditLists {

	public static void main(String[] args) {
		
		String[] firstArray = {"blue", "green", "yellow", "red", "cyan"};
		List<String> list1 = new ArrayList<String>(Arrays.asList(firstArray));
		/*
		 * List<String> list1 = new ArrayList<String>(); 
		 * for(String text:firstArray) {
		 * list1.add(text); }
		 */
		//Collections.addAll(list1, firstArray);
		System.out.println(list1);
		
		String[] secondArray = {"yellow", "red"};
		List<String> list2 = new ArrayList<String>();
		for(String text1:secondArray) {
			list2.add(text1);
		}
		
		//Now print out: Original List1:
		System.out.println("List 1 before editing: ");
		for(int i = 0; i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
		
		System.out.println("\n++++++++++++++++++++++++++++++++++");
		
		//Write a function to remove items from List 1 if duplicate in List 2:
		editList(list1, list2);
		System.out.println();
		//Then print out List 1 again after removing items duplicated in list 2:
		//Now print out: Original List1:
		System.out.println("List 1 after editing: ");
		for(int i = 0; i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
		
		System.out.println("\n++++++++++++++++++++++++++++++++++");
		
	}
	
	//Here is the editList Method:
	public static void editList(Collection<String> l1, Collection<String> l2) {
		
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()) {
			if(l2.contains(it.next())) {
				it.remove();
			}
		}
	}

}
