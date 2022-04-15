package com.Array;

public class ArrayDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] =  new int [3][3];
		    
		    // display matrix using for loops
		   
		    for(int i=0; i<matrix.length; i++) {
		      
		      for(int j=0; j<matrix[i].length; j++) {
		    	  System.out.print("" + i + "" + j + ""+"   ");
		      }
		      System.out.println();
		      System.out.println();// new line
		    }
	}

}
