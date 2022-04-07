package com.tns;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart4 extends Applet {
	Button b1,b2;
	TextField t;
	 
	public void init(){
		add(b1 = new Button("Click") );
		add(t= new TextField(10));
		add(b2 = new Button("Clear") );
		b1.addActionListener(new ActionListener() {       //anonymous class created
			public void actionPerformed(ActionEvent e) {
				t.setText("hello world");
			}
			
		});
		b2.addActionListener(new ActionListener() {   //anonymous class created
			public void actionPerformed(ActionEvent e) {
				t.setText(" ");
			}
			
		});
	}
	
}
