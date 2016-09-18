package com.sjsu.cmpe273.refresher.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericIterator {
	
	public static <Item> void iterateGeneric( List<Item> inputList ) {
	      // Display array elements
	      for(Item element : inputList) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	   }


	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("One");
		stringList.add("Two");
		stringList.add("Three");
		stringList.add("Four");
		stringList.add("Five");
		
		System.out.println("Integer list:");
		iterateGeneric(intList);
		
		System.out.println("String list:");
		iterateGeneric(stringList);
	}

}
