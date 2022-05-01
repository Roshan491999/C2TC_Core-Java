package CollectionFramework;

public class MyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVector v1,v2;
		
		Employee e1 = new Employee(1,"roshan",10000);
		Employee e2 = new Employee(1,"roshan",10000);
		v1 =new MyVector();
		v2=v1;
		System.out.println(v1.equals(v2));  //true
		System.out.println(v1.hashCode());  //366712642
		System.out.println(v2.hashCode());  //366712642
		

		System.out.println(e1.equals(e2));  //true
		System.out.println(e1.hashCode());  //6
		System.out.println(e2.hashCode());  //6
		
		
		
		

	}

}
