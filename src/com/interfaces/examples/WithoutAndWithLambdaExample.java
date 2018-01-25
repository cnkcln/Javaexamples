package com.interfaces.examples;

import java.util.ArrayList;
import java.util.List;

public class WithoutAndWithLambdaExample {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub

		int width = 10;
		Drawables d = new Drawables() {

			@Override
			public void draw() {
				// TODO Auto-generated method stub

				System.out.println("draw :" + width);
			}

		};
		d.draw();*/
		//for java 8 
		/*int width = 10;
		Drawables d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
		*/
	/*	Drawables s1=(name)->{  
			return "Hello : "+name;  
		};  
		System.out.println(s1.hello("lakshmi"));*/
		/*Drawables adding = (a,b) ->(a+b);
			System.out.println(adding.add(10,20)); */ 
	 
	/*	Drawables adding2 = (a,b)->{
			return (a+b);
		};
	int abc=	adding2.add(10, 60);
		System.out.println(abc);*/
		
		//for each loop in lambda
		
		List<String>  al = new ArrayList<String>();
		al.add("hello");
		al.add("hello1");
		al.add("hello2");
		al.add("hello3");
		al.add("hello4");
		
		al.forEach((n)-> System.out.println(n));
		
	}

	
	
	
	 
	
}
