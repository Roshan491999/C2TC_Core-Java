package day12;
abstract class E11
{
int i,j;

	public int getI() {
	return i;
}

public void setI(int i) {
	this.i = i;
}
 
public int getJ() {
	return j;
}

public void setJ(int j) {
	this.j = j;
}

	abstract void m1();
	
	void m2() 
	{
	System.out.println("hello world");
	}
	
	abstract void m3();
}
        
 class D11 extends E11 
{
	 void m1() {
		
	}
	 void m3() {
			
		}
	
	
}                

public class GetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D11 obj = new D11();
obj.m1();
obj.m2();
obj.m3();
obj.setJ(100);
obj.setI(100);
System.out.println(obj.getJ());
System.out.println(obj.getI());

	}

}
