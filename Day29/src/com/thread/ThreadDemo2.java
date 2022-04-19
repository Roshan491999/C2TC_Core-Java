package com.thread;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo2 extends Frame implements Runnable{
	TextField t1,t2;
	int i;
	public ThreadDemo2() {
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
			
		});
		setSize(200,400);
		setVisible(true);
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for( i=0 ;i<=3; i++)
			System.out.println(i);
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThreadDemo2 td=new ThreadDemo2();
		Thread th = new Thread(new ThreadDemo2());
		th.start();

	}

}
