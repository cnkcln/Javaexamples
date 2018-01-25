package com.sorting.examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SoringArrayExample {
	public static void main(String[] args) {
		String[] collections = {"hoshitha","chengannagari","narasimham","lakshmi","world","hello"};
		Arrays.sort(collections);
		 for(String a: collections) {
			System.out.println("The sorting array is :" +a);
		} 
		for(int i=0;i<collections.length;i++) {
			System.out.println("Countries : "+collections[i]);
		}
		String[] languages = {"Java", "Scala", "C++", "Ruby", "Python", "Perl"}; // looping over array using foreach loop System.out.println("Iterating over String array using Java 1.5 foreach loop"); for(String str : languages){ System.out.println(str); }
		 for(String str : languages){
	            System.out.println(str);
	        }
 }
	
}
	
	
	
	
