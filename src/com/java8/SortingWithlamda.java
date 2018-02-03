package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingWithlamda {
public static void main(String[] args) {
	List<Product> list1 = new ArrayList<Product>();
	
	list1.add(new Product(1,"ramu",10.0f));
	list1.add(new Product(2,"hari",11.0f));
	list1.add(new Product(3,"rajesh",12.0f));
	
	System.out.println("sorted with names.....");
	
	
	Collections.sort(list1,(p1,p2)->{
		return p1.name.compareTo(p2.name);
		
	});
	
	 for(Product p:list1){  
		 if(p.id==0) {
			 System.out.println("fsdssdfsdfsdfsd");  
			 
			 
		 }
		 else
			 System.out.println(p.id+" "+p.name);  
		 }
     }  

	
	
	
}
