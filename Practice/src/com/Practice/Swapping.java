package com.Practice;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	  
	      x = in.nextInt();
	      y = in.nextInt();
	  
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	  
	   // for e.g no. is 54 and 67
	      x = x + y;  // 54+67 = 121
	      y = x - y;  // 121-67 = 54   now y holding the value 54
	      x = x - y;  // 121-54 = 67   now x is holding the value 67
	  
	      System.out.println("After Swapping \nx = "+x+"\ny = "+y);
	      //numbers are swapped
	      

	}

}
