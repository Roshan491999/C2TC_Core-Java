package com.Array;


import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ArrayDmo4 extends Frame {
	int[][] b;
	int i;
	int j;
	
	public void ArrayDmo4() {
		setLayout(new GridLayout(3,3));
		b=new int [3][3];
		
		for( i=0; i<b.length; i++) {
			for(j=0; j<b[i].length; j++) {
				
				
				System.out.print("[" + i + "][" + j + "]"+"  ");
			}
		
		}
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
		setSize(200,200);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new ArrayDmo4();
		// TODO Auto-generated method stub

	}

}
