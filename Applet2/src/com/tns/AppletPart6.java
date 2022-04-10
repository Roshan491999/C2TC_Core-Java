package com.tns;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart6 extends Applet {
	Button b1,b2;
	static TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t= new TextField(10));
		add(b2 = new Button("Clear"));
		
		
	
		b1.addActionListener(new A());
		b2.addActionListener(new B());
		
		
		
	}

	
	}

class A implements ActionListener{
	
	
	
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	
	AppletPart6.t.setText("hello world");
}

}

class B  implements ActionListener{
	
	
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
	
	
	AppletPart6.t.setText(" ");
}

}
 
 