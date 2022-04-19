package com.equalsmethod;
class A{
	
}

public class EqualDemo3 {

	public static void main(String[] args) {
		
		A a =new A();
		A c1 =c;
		A c =new A();
		
		if(a==b) {//equal
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
        
		if(a==c) {//not equal
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		if(a.equals(b)) {//equal
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		if(a.equals(c)) {//not equal
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}

	}

}
