package com.MouseMotionListner;

import java.applet.Applet;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotion extends Applet {
	TextField t;
	public void init() {
		add(t = new TextField(15));
		
	 addMouseMotionListener(new MouseMotionAdapter(){
		 
		public void mouseMoved(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			//String i = String.valueOf(x);
			//String j = String.valueOf(y);
			t.setText(String.valueOf(x) +" , "+ String.valueOf(y));
			
		}
	});
}
}
