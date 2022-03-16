package day6;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int a , b=1 , c;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("number which table has to be created:=");
		a = sc.nextInt(); 
		
		while(b<=10) {
			c = a*b;
			System.out.println(c);
			b++;
		}
	}

}
