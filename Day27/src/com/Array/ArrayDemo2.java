package com.Array;
 class Car{
	 
	 public void Start() {
		 System.out.println("the car is starting");
	 }
	 public void getSpeed() {
		 System.out.println("the car is speeding");
	 }
	 public void Stop() {
		 System.out.println("the car is stoping");
	 }
}
class Maruti extends Car{
	Maruti m;
	@Override       //overriding the method getcar
	
	public void getSpeed() {
		 System.out.println("the maruti car is speeding");
	 }
	public void getcar() {
		 System.out.println("the maruti car ");
	 }
	
}
class Creta extends Car{
	Creta C;
	public Creta getcar1() {
		System.out.println("this is creta car");
		return C;
	}
	
}
public class ArrayDemo2 {

	public static void main(String[] args) {
		Car c =new Maruti();//upcasting 
		c.Start();
		c.Stop();
		c.getSpeed();//her we get method from class car but the logic is from maruti 
		Maruti m = (Maruti)c; //downcasting
		m.getcar();
		
		// TODO Auto-generated method stub

	}

}
