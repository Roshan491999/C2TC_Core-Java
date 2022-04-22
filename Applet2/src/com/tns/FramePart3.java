package com.tns;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramePart3 extends Frame implements ActionListener{
	Button b1,b2;
	static TextField t;
	
	public FramePart3() {
		
		setLayout(new FlowLayout());
		add(b1 = new Button("Click"));
		add(t= new TextField(10));
		add(b2 = new Button("Clear"));
		
		
	
		b1.addActionListener(new A2());
		b2.addActionListener(new B2());
		
		
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
		new FramePart3();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
class A2 implements ActionListener{
	
	
	@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	
		FramePart3.t.setText("hello world");
}

}

class B2 implements ActionListener{
	
	@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
	
	
		FramePart3.t.setText(" ");
}

}