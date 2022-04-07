package com.tns;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart6 extends Applet{
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t= new TextField(10));
		add(b2 = new Button("Clear"));
		
		A a =new A();
		
		B b =new B();
		
		 b1.addActionListener(a);
		b2.addActionListener(b);
		 
		
		
		
	}
	}
class A extends AppletPart6 implements ActionListener{
    public A() {
    	b1.addActionListener(this);
    }

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	t.setText("hello world");
}

}
class B extends A implements ActionListener{
public B() {
	b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
t.setText(" ");
}

}
 
 