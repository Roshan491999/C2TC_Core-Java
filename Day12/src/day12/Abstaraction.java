package day12;
abstract class A
{

	abstract void m1();
	
	void m2() 
	{
		System.out.println("hello");
	}
	
	abstract void m3();
}
        
 class B extends A //if we make  B class also abstract then we cannot pass it to the object
{
	 void m1() {
		
	}
	 void m3() {
			
		}
	
	 //also we cannot take method m m1 and m3 here because to take those method class has to be abstract
}                

public class Abstaraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		   obj.m2();
		   
	}

}
