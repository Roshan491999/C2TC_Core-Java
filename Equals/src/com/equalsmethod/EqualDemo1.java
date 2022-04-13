package com.equalsmethod;

public class EqualDemo1 {

	public static void main(String[] args) {
		int i = 13;
        int j = -5;
        int k = 13;
         //here we used comparator operator to compare two integer value
        
        if(i == j) {
            System.out.println("val1 and val2 are equal");
        } else {
            System.out.println("val1 and val2 are Not equal");
        }   
 
        if(k == i) {
            System.out.println("val1 and val3 are equal");
        }else {
            System.out.println("val1 and val3 are not equal");
        }        

	}

}
