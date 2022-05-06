package com.abstraction;

abstract class  Car{
	
	public void m1() {
		System.out.println("this is car");
	}
	
	abstract void m2();
	
}

class Maruti extends Car{
	
	void start(){
		System.out.println("maruti is a car");
	}
	public void m1() {
		System.out.println("this is maruti");
	}
	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class Creta extends Car{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}
	
}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Maruti(); //upcasting
		
		Maruti m = (Maruti)c;
		

	}

}
