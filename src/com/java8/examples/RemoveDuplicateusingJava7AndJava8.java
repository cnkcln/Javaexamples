package com.java8.examples;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateusingJava7AndJava8 {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("one");// Duplicate
		al.add("one");// Duplicate
		al.add("two");
		al.add("tWO");
		al.add("two");

		List<String> li = new ArrayList<String>(new LinkedHashSet<String>(al));

		System.out.println(li);

		for(String s : li) {
			System.out.println(s);
		}
		
		List<String> dis = li.stream().distinct().collect(Collectors.toList());
		System.out.println("java8 distinct " + dis);

	}

}
