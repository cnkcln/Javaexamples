package com.samples;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysExamples {

	/*public static void main(String a[]) {
		char[] chrArr = { 'a', 'c', 'd', 'y', 'e', 'q', 'b' };
		int index = Arrays.binarySearch(chrArr, 0, chrArr.length - 1, 'd');
		System.out.println("Char 'q' index is: " + index);
		
		
	}
	
	*/
	
	public static void main(String a[]){
        
        String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        Arrays.sort(strArr,new Comparator<String>(){
 
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }});
         
        for(String str:strArr){
            System.out.println(str);
        }
    }
}
