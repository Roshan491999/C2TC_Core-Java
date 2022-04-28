package com.practice2;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declaring variables
		double principal = 0.0;
		double rate = 0.0;
		int time = 0;
		double interest = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter your principal value");
		principal = sc.nextDouble();
		
		System.out.println("enter the rate of interest");
		rate = sc.nextDouble();
		
		System.out.println("enter the time(in years)");
		time = sc.nextInt();
		
		interest =(principal*rate* time)/100;
		
		System.out.println("1the simple interest is :-"+interest);
		
		double value = interest+principal;
		
		System.out.println("complete value is:- "+value);
		

	}

}
