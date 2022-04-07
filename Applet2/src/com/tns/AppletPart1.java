 package com.tns;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart1 extends Applet implements ActionListener {
	
	TextField t1,t2,t3;
	Button b;
	Label l;
	
	public void init() {

		add(t1= new TextField(2));
		add(l=new Label("+"));
		add(t2= new TextField(2));
		
		add(b = new Button("="));
		add(t3= new TextField(2));
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		b.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e) {
	Object o = e.getSource();
	if(o.equals(b)) {
		String s1 = t1.getText();
	int i = Integer.parseInt(s1);
	String s2 = t2.getText();
	int j = Integer.parseInt(s2);
	int k=i+j;
	String s3 = String.valueOf(k);
	t3.setText(s3);}
		
	}

}