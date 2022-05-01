package CollectionFramework;

import java.util.HashSet;
import java.util.Vector;

public class VectoeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		String s1 = new String ("Mansi");
		String s2 = new String ("Mansi");
		Employee e1 = new Employee(1,"roshan",10000);
		Employee e2 = new Employee(1,"roshan",10000);
		v1.add(s1);
		v1.add(e1);
		System.out.println(v1.contains(s2));  //true
		System.out.println(v1.contains(e2));  //true
		
		HashSet hs1 =new HashSet();
		hs1.add(e1);
		System.out.println(hs1.contains(e2));//true
		System.out.println(e1.hashCode());   //6
		System.out.println(e2.hashCode());   //6
		
		
		
		


	}

}
