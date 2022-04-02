package com.saturday;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// prime number :- a number that can be divided exactly only by itself and 1.
		  int i,m=0,num=0;      
		  int n; 
		  
		  Scanner sc = new Scanner(System.in);
			System.out.println("give nunmber to check:=");
			n = sc.nextInt(); //it is the number to be checked input from user
		  
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++)
		   {      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     num=1;      
		     break;      
		    }      
		   }      
		   if(num==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		}    
		  
	}


