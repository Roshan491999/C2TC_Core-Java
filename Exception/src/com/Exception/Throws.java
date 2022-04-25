package com.Exception;

import java.io.*;

public class Throws {
	void mymethod(int num) throws ClassNotFoundException, IOException {
		if (num==1)
			throw new IOException("Exception message1");
		else
			throw new ClassNotFoundException("Exception message 2");
	}
	}
	class Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Throws obj = new Throws();
			obj.mymethod(0);;
		}
			catch(Exception ex){
				System.out.println(ex);
			}
			
		

	

}
}