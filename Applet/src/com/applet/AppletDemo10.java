package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class AppletDemo10 extends Applet{
	 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	 TextField t;
	 public void init() {
		 add(b1 = new Button("1"));
			add(b2 = new Button("2"));
			add(b3 = new Button("3"));
			add(b4 = new Button("4"));
			add(b5 = new Button("5"));
			add(b6 = new Button("6"));
			add(b7 = new Button("7"));
			add(b8 = new Button("8"));
			add(b9 = new Button("9"));
			add(b10 = new Button("10"));
			add(t = new TextField(10));
			
	 }
	 public boolean action ( Event e, Object O)  {
			
			if(e.target.equals(b1)) {
				int a=1, c;
				for(int i=1;i<=10; i++) {
					c =a*i;
					String s3 = String.valueOf(c);
					t.setText(s3);
					
					}
			
			
			}
			return true;
}
	 }
