package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToStringArray {
	public static void main(String args[]){

	    List<String> al = new ArrayList<String>();

	    al.add("One");
	    al.add("Two");
	    al.add("Three");
	    al.add("Four");
	    al.add("Five");

	    String[] stringArrayObject = new String[al.size()];
	    al.toArray(stringArrayObject);

	    for(String temp : stringArrayObject)
	    System.out.println(temp);

	}
	}