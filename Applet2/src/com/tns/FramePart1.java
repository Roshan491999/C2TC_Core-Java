package com.tns;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramePart1 extends Frame implements ActionListener{
	TextField t1,t2,t3;
	Button b;
	Label l;
	
	public  FramePart1() {
		setLayout(new FlowLayout());
		
		add(t1= new TextField(2));
		add(l=new Label("+"));
		add(t2= new TextField(2));
		
		add(b = new Button("="));
		add(t3= new TextField(2));
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		b.addActionListener(this);
		
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
		new FramePart1();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object o = arg0.getSource();
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
