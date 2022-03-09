package Day2;
//inheritance exmaple
class A{
	public void m1() { //area of circle
		System.out.println("area of a circle");
		float pi=(float)3.14,radius=15 ;
		float area = pi*radius*radius;
				System.out.println(area);
	}
}

class B extends A {
	public void m2(){//area of rectangle
		System.out.println("area of rectangle is");
		int length= 20, width=10 ;
		int area=length*width;
		System.out.println(area);
		
		
		
	}
}


public class class1 {

	public static void main(String[] args) {
		A a,a1;
		B b;
		a=new A();
		b=new B();
        a1=a;
        a1.m1();
        
        b.m2();
	}

}
