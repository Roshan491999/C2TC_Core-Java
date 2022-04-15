package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Equality {

	public static void main(String[] args) {
		int x[] = new int[5];
		int y[] = new int [5];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter five elemnts of first array");
		
		for(int i=0; i < x.length; i++) {
		      // read input from user
		      x[i] = scan.nextInt();
		    }
		System.out.println("enter five elemnts of second array");
		
		for(int i=0; i < y.length; i++) {
		      // read input from user
		      y[i] = scan.nextInt();
		    }

		if(Arrays.equals(x,y)) {
			System.out.println("Arrays Are equal");
		}
		else {
			System.out.println("Arrays Are not equal");
		}
		// TODO Auto-generated method stub

	}

}
