package com.tns;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart2 extends Applet implements ActionListener {
	TextField t;
	Button b1,b2;
	public void init() {
		add (b1= new Button("Click"));
		add(t= new TextField(10));
		add (b2= new Button("Clear"));
		
		b1.addActionListener(this);
		b2.addActionListener(new A());                              //giving object of class A to ActionListner
	}
	public void actionPerformed(ActionEvent arg0) {
		t.setText("hello world");
	}
class A implements ActionListener{                                    //creating inner class  
          public A() {
        	  b2.addActionListener(this);
          }

	public void actionPerformed(ActionEvent arg0) {
		t.setText("");
		// TODO Auto-generated method stub
		
	}
	
}
}
