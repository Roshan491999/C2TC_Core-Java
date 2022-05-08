package com.abstraction;


abstract class  Shopacc{
	
	int accNo;
	String accNm;
	float charges;
	
	
	
	
	
}

abstract class Primeacc extends Shopacc{
	
	
	
	
	
}

abstract class Normalacc extends Shopacc{

	
	}
	


public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shopacc c = new Primeacc(); //upcasting
		
		 Primeacc m = (Primeacc)c;//downcasting
		


	}

}
