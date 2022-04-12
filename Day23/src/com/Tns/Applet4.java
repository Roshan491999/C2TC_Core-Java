package com.Tns;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet4 extends Applet {
	  Button b1,b2;
	  TextField t;
	 public void init() {
		 add(b1= new Button("Click"));
		 add(t= new TextField(10));
		 add(b2= new Button("Clear"));
		 C c =new C();                                          // creating object of class C
		 c.Takeref(this);
		 b1.addActionListener(c);
		 b2.addActionListener(new B(this));
	 }
	  
}
 class C implements ActionListener {

	 Applet4 a;
	 public void Takeref(Applet4 ap) {// giving reference of this class to the to class Applet4 so that it gave the access to perform action
		 a=ap;
		 
	 }
	 
	public void actionPerformed(ActionEvent arg0) {
		
		// TODO Auto-generated method stub
		a.t.setText("Hello World");
	}
	 
 }

 class B implements ActionListener {
	 Applet4 ap;// declaring a variable for class where action to be performed
	 public B(Applet4 ap) {
		 this.ap = ap;   // the method which gives this reference to the ap
	 }
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ap.t.setText(" ");//performing action and setting text in textfield
	}
	 
 }
   
   