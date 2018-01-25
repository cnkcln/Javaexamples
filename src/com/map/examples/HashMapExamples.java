package com.map.examples;

import java.util.HashMap;

public class HashMapExamples {
 public static void main(String[] args) {
	
	 
	 HashMap<String, String> hm = new HashMap<String, String>();
	 hm.put("first", "FIRST INSERTED");
     hm.put("second", "SECOND INSERTED");
     hm.put("third","THIRD INSERTED");
     System.out.println(hm);
     
     //copy one map to another map.
      HashMap<String, String> subMap = new HashMap<String, String>();
      subMap.put("s1", "S1 VALUE");
      subMap.put("s2", "S2 VALUE");
      hm.putAll(subMap);
      System.out.println(hm);
     ///////////////////////////////////////////////////
      
      System.out.println("getting value for the given key from hashmap");
      System.out.println("Value of second: "+hm.get("second"));
      System.out.println("Is HashMap empty? "+hm.isEmpty());
      hm.remove("third");
      System.out.println(hm);
      System.out.println("Size of the HashMap: "+hm.size());
}
}
