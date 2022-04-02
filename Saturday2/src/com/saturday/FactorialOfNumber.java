package com.saturday;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 int i,fact=1;  
		  int number;
		  Scanner n = new Scanner(System.in);//It is the number to calculate factorial    
		  number = n.nextInt();
		  
		  for(i=1;i<=number;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		
	}

