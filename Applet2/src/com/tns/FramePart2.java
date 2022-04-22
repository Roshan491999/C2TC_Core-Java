package com.tns;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class FramePart2 extends Frame implements ActionListener {
	TextField t;
	Button b1,b2;
	
	public FramePart2() {
		
		setLayout(new FlowLayout());
		
		add (b1= new Button("Click"));
		add(t= new TextField(10));
		add (b2= new Button("Clear"));
		
		b1.addActionListener(this);
		b2.addActionListener(new A3());
	
		
		
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
			
		});
		setSize(400,400);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		t.setText("");
	}
	
	class A3 implements ActionListener{                                    //creating inner class  
        public A3() {
      	  b2.addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent arg0) {
    		// TODO Auto-generated method stub
    		t.setText("hello world");
    	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FramePart2();
	}
	

}	
}