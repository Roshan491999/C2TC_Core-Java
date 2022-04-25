package com.Exception;

public class MultipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent try block
		try {
			System.out.println("inside block 1");
			int b=45/0;
			System.out.println(b);
			//child try block
			try {
				/*System.out.println("inside block 1");
				int b=45/0;
				System.out.println(b);*/
				
			}
			catch(ArithmeticException e1) {
				System.out.println("Exception :e1");
			}
		}
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic Exception ");
			System.out.println("inside parent try catch block");
		}

	}

}


//OUTPUT
//inside block 1
//Arithmetic Exception 
//inside parent try catch block
