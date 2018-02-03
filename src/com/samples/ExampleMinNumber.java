package com.samples;

public class ExampleMinNumber {

	public static void main(String[] args) {
		int a = 10,b=20;
		
		swap(a,b);
	}

	private static void swap(int a, int b) {
		
		
		int c = a;
		a = b;
		b=c;
		System.out.println("After swapping(Inside), a = " + a + " b = " + b);
	}
	
	
	
}
