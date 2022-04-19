package com.thread;

import java.applet.Applet;
import java.awt.Event;
import java.awt.TextField;

public class ThreadDemo3 extends Applet implements Runnable{
	TextField t1,t2;
	int i;
	public void init() {
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
	}
	public boolean action(Event e,Object o) {
    
    	
    	t1.setText(String.valueOf(i));
    	t2.setText(String.valueOf(i));
    	
    	
    	
    	
    	return true;
    	
    }
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
				for( i=0 ;i<=1000; i++)
					System.out.println(i);
	}

}
