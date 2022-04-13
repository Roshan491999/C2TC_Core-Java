package com.equalsmethod;

public class EqualsDemo2 {

	public static void main(String[] args) {
		String s1 = new String("HELLO WORLD");
       String s2 = new String("HELLO  WORLD");        
         
        System.out.println("s1 and s2 are equal : "+(s1==s2));      
        System.out.println("s1 and s2 are equal : "+(s1.equals(s2)));  
 
        s1 = s2;
        System.out.println("s1 and s2 are equal : "+(s1==s2)); 

	}

}
//OUTPUT
/*s1 and s2 are equal : false
s1 and s2 are equal : false
s1 and s2 are equal : true
*/