package com.hashtable.examples;

import java.util.Hashtable;

public class MyHashtableUserKeys {
	public static void main(String a[]){
		 
        Hashtable<Emp,String> tm = new Hashtable<Emp, String>();
        tm.put(new Emp(134,"Ram",3000), "RAM");
        tm.put(new Emp(512,"Tom",2400), "TOM");
        System.out.println("Fecthing value by creating new key:");
         
        Emp e = new Emp(512,"Tom",2400);
        System.out.println(e+" ==> "+tm.get(e));
    }
}
