package com.Sorting;

import java.util.Arrays;

public class SortDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining an array of integer type   
		int [] num = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
		//printing array list before sorting
		System.out.println("Elements of array befor sorting: "); 
		for (int i = 0; i < num.length; i++)   
		{       
		System.out.println(num[i]);   
		}   
		//invoking sort() method of the Arrays class  
		Arrays.sort(num);   
		System.out.println("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < num.length; i++)   
		{       
		System.out.println(num[i]);   
		}   

	}

}
