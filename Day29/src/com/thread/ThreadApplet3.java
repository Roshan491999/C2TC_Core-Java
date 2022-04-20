package com.thread;

import java.applet.Applet;
import java.awt.TextField;

public class ThreadApplet3 extends Applet
{
	TextField t1,t2;
	int i,j;
	 
	public void init() {
		
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		C1 c =new C1(this);
		c.start();
		
		D1 d =new D1(this);
		d.start();
		
	}

}
class C1 extends Thread{
	ThreadApplet3 tha1;
	C1(ThreadApplet3 tha1)
	{
		this.tha1=tha1;
		
	}
	public void run() {
		while(true)
		{
			
		      tha1.t1.setText(String.valueOf(tha1.i));
			if(tha1.i==100)
				tha1.i=0;
			else
				tha1.i++;
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				
			}
		}
	}
		
	
}
class D1 extends Thread{
	ThreadApplet3 tha2;
	D1(ThreadApplet3 tha2)
	{
		this.tha2=tha2;
		
	}
	
public void run() 
{
	
	while(true)
	{
		
	      tha2.t2.setText(String.valueOf(tha2.j));
		if(tha2.j==100)
			tha2.j=0;
		else
			tha2.j++;
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			
		}
	}
}
}