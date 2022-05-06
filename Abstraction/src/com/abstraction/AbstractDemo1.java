package com.abstraction;


abstract class  Car1{
	
	public void m1() {
		System.out.println("this is car");
	}
	
	
	
}

abstract class Maruti1 extends Car1{
	
	void start(){
		System.out.println("maruti is a car");
	}
	public void m1() {
		System.out.println("this is maruti");
	}
	
	
	
}

abstract class Creta1 extends Car1{

	
	}
	
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Car1 c = new Maruti1(); //upcasting
		
		Maruti1 m = (Maruti1)c;
		


	}

}
