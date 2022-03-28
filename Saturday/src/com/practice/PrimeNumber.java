package com.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 int year;
		  // a leap year is divisible by 4
		 //a year ending with 00 is leap year only if it is divisible by 100
		 //a century year should be divisible by 4 and 100 both
		 
		 Scanner p = new Scanner(System.in);//takes input from user eg.2024
		 year = p.nextInt();
		 
		 if ((year % 400 == 0)||(year % 4 == 0) && (year %100 != 0)) {
			 //both the conditions follows then show this
			 System.out.println(year +"is leap year");
		 }
		 else {
			 //any one condition not follows print this
			 System.out.println(year +" 21is not leap year");

		 }

	}

}
/*
2024
2024is leap year
*/