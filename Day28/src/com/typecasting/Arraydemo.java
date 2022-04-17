package com.typecasting;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Arraydemo extends Frame implements ActionListener {
	Button[][] b;
	int i;
	int j;
	
	public Arraydemo() {
		setLayout(new GridLayout(3,3));
		b= new Button [3][3];
		
		for( i=0; i<b.length; i++) {
			for(j=0; j<b[i].length; j++) {
				if(Math.random()<0.5) 
					add(b[i][j] = new Button("X"));
				else
					add(b[i][j] = new Button("O"));
				b[i][j].addActionListener(this);
					}
			}
		
	addWindowListener(new WindowAdapter(){
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
	});
			
		setSize(400,400);
		setVisible(true);
		
	}


	public static void main(String[] args) {
		
		new Arraydemo();
	}

	
	public void actionPerformed(ActionEvent arg0) {
		Object O = arg0.getSource();
		
		if (O instanceof Button) 
		{
			String c =((Button) O).getLabel();
			
			if(c.equals("X"))
				((Button)O).setLabel("O");
			else
				 ((Button)O).setLabel("X");
		
		
	}


}

}