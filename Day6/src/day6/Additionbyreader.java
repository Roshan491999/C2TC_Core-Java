package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Additionbyreader {

	public static void main(String[] args) throws IOException {
		int a,b,s;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Br-Enter First Number:");
		a=Integer.parseInt(br.readLine());
		
		System.out.println("Br-Enter Second Number:");
	    b=Integer.parseInt(br.readLine());
	    
	    s =a + b;
	    
	    System.out.println("sum is :="+s);

	}

}
