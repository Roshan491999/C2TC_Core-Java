package com.Exception;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent try block
				try {
					
					//child try block
					try {
						System.out.println("inside block 1");
						int b=45/0;
						System.out.println(b);
						
					}
					catch(ArithmeticException e1) {
						System.out.println("Exception :e1");
					}
				}
				catch(ArithmeticException e3) {
					System.out.println("Arithmetic Exception ");
					System.out.println("inside parent try catch block");
				}
				finally {
					System.out.println("its Executed");
				
				}


	}

}
