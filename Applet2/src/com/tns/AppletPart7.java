package com.tns;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart7 extends Applet implements ActionListener{
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t= new TextField(10));
		add(b2 = new Button("Clear"));
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(new E(this));
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		t.setText("hello world");
	}

	
	}
class E  implements ActionListener{
	AppletPart7 ap;
	E(AppletPart7 ap){
		this.ap =ap;
	}
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	ap.t.setText(" ");
}
}