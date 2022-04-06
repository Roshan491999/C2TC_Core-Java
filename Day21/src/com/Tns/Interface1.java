package com.Tns;


// final class cannot be extend 

final class A {
	
	public void meth(){
		
	}
	
}
 
class B extends  A   
//here B cannot extends A because the class A declared as a final thus it gave error

{
	
}

class C{
	int i=1,j;
	 
	final void add() {	
		 j=i*2;
		 System.out.println(j);
		
	}
}

//check whether final method be override

class D extends C {          
	
	
	void add(){
		
	 //- overrides com.Tns.C.add
    // - Cannot override the final method from C
	
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
