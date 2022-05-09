package com.Practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0 ,remainder=0;
		
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		
		
		if (a>10) 
			System.out.println("given value is "+a);
		else
			System.out.println("enter value greater than 10");
		
		if(a>10 & a<100) {
			remainder=a%10;
			a= a-remainder;
			System.out.println(a);
			}
		else if(a>100 & a<1000) {
		remainder=a%100;
		a= a-remainder;
		System.out.println(a);
		}
		else if(a>1000 & a<10000){
			remainder=a%1000;
			a= a-remainder;
			System.out.println(a);
		}
		else if(a>10000 & a <100000){
			remainder=a%10000;
			a= a-remainder;
			System.out.println(a);
		}
		else if(a>100000 & a<1000000){
			remainder=a%100000;
			a= a-remainder;
			System.out.println(a);
		}
		else if(a>1000000 & a<10000000){
			remainder=a%1000000;
			a= a-remainder;
			System.out.println(a);
		}
		else if(a>10000000 & a<100000000){
			remainder=a%10000000;
			a= a-remainder;
			System.out.println(a);
		}
		else if(a>100000000 & a<1000000000){
			remainder=a%100000000;
			a= a-remainder;
			System.out.println(a);
		}


	}

}
