package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> al =new ArrayList<student>();
		List<student> la = new ArrayList<student>();
		List<student> lv= new Vector<student>();
		List<student> l = new LinkedList<student>();
		
		student s1 = new student(1,"Alfiya",12);
		student s2 = new student(2,"Abhishek",13);
		student s3 = new student(3,"Aniket",13);
		student s4 = new student(4,"Chetan",15);
		student s5 = new student(5,"Harish",19);
		student s6 = new student(6,"Jyoti",13);
		student s7 = new student(7,"Kumendra",15);
		student s8 = new student(8,"Meraj",17);
		student s9 = new student(9,"Naseer",18);
		student s10 = new student(10,"Mohtasim",16);
		student s11= new student(11,"Moin",18);
		student s12= new student(12,"Neha",13);
		student s13= new student(13,"Payal",12);
		student s14= new student(14,"Alfiya",12);
		al.add(s1);
		al.add(s14);
		System.out.println(al.size());
		al.remove(s14);
		System.out.println(al.size());
		System.out.println(al.contains(s14));
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al.size());
		Iterator <student> it = al.iterator();
		while(it.hasNext()) {
			student s = it.next();
			System.out.println(s);
		}
		Stream <student> ss = al.stream();
		System.out.println(ss);
		System.out.println("------------------------------------------------------");
		al.stream().forEach(System.out::println);
		System.out.println(al.stream().mapToDouble(student::getMarks).average());
		OptionalDouble od = al.stream().filter((s)-> s.getMarks()<14).mapToDouble(student::getMarks).average();
		System.out.println(od);
		System.out.println("Min Mark ="+al.stream().min(Comparator.comparing(student::getMarks)));
		System.out.println(al.stream().filter((s)-> s.getMarks()< 20).map((s)-> s.getMarks()).collect(Collectors.toSet()));
		
		
		
		
		

	}

}
