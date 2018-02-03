package com.java8.examples;

public class Factorial {
	public static void main(String[] args) {
		int fact = 1,  j;
		for (j = 1; j <= 5; j++) {
			fact = fact * j;
		}
		System.out.println("factorial for 5 is : " + fact);
		String str = "java4s";

		// Check whether the given character is a number of not ?

		for (int i = 0; i < str.length(); i++) {

			Boolean flag = Character.isDigit(str.charAt(i));

			if (flag) {
				System.out.println("'" + str.charAt(i) + "' is a number");
			} else {
				System.out.println("'" + str.charAt(i) + "' is not a number");
			}

		}

	}
}