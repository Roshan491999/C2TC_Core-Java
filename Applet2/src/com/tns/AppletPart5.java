package com.tns;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;

public class AppletPart5 extends Applet{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener((ActionEvent e) -> {t.setText("hello world");}); //lambda expression also cane be written as
		//b1.addActionListener(( e) -> {t.setText("hello world");});
		//b1.addActionListener(( e) -> t.setText("hello world"));
		b2.addActionListener((ActionEvent e) -> {t.setText(" ");});
	}	

}
