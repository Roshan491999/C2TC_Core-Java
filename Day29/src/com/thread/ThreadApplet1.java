package com.thread;

import java.applet.Applet;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadApplet1 extends Applet implements Runnable{
	TextField t1,t2;
	Thread th1,th2;
	int i,j;
	public void init() {
		
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		th1 =new Thread(this);
		th2 =new Thread(this);
		th1.start();
		th2.start();
		
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			Thread th = Thread.currentThread();
			if(th.equals(th1)) {
				t1.setText(String.valueOf(i));
				if(i==100)
					i=0;
				else
					i++;
			}
		
				
				if(th.equals(th2)) {
					t2.setText(String.valueOf(j));
					if(j==100)
						j=0;
					else
						j++;
				}
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			
		}
		}
		}
}
