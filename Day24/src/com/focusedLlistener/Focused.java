package com.focusedLlistener;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Focused extends Applet{
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1= new Button("Click"));
		add(t= new TextField(15));
		add(b2= new Button("Clear"));
		
		b1.addFocusListener(new FocusListener() {//used anonymous class
//instead of actionlistener we used focusListner which has two abstract methods
					
					public void focusGained(FocusEvent arg0) {
						// TODO Auto-generated method stub
						t.setText("hello world");
					}

					
					public void focusLost(FocusEvent arg0) {
						// TODO Auto-generated method stub 
					}
					});
		
		b2.addFocusListener(new FocusAdapter() {
			// Focus Adapter is used when we don't want all the methods to get implemented 
			
			public void focusGained(FocusEvent e) {
				t.setText(" ");
			}
			});
	}

}
