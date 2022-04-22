package com.tns;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramePart4 extends Frame {
	Button b1,b2;
	TextField t;
	
	public FramePart4(){
		
		setLayout(new FlowLayout());
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener((ActionEvent e) -> {t.setText("hello world");});
		
		b2.addActionListener((ActionEvent e) -> {t.setText(" ");});

		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
			
		});
		setSize(400,400);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  FramePart4();

	}

}
