package com.abstraction;

abstract class  Car{
	
	 void m1() {
		System.out.println("this is car");
	}
	
	
}

class Maruti extends Car{
	
	void start(){
		System.out.println("maruti is a car");
	}
	void m1() {
		System.out.println("this is car");
	}
	
}

class Creta extends Car{

	
}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Maruti(); //upcasting
		Maruti m = (Maruti)c;
		m.

	}

}
