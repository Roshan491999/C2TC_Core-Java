package com.thread;

import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.TextField;

import com.thread.ThreadFrame2.A;

public class ThreadApplet2 extends Applet implements Runnable
{
	TextField t1,t2;
	Thread th;
	int i,j;
	
	public void init()
	{
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		th =new Thread(this);
		B b = new B();
		th.start();
		b.start();
	}
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		while(true)
		{
			Thread th = Thread.currentThread();
			 
				t1.setText(String.valueOf(i));
				if(i==100)
					i=0;
				else
					i++;
				
				 try 
				 {
					Thread.sleep(10);	
				 } 
				 catch (Exception e)
				 {	
				}
		}
		
}
class B extends Thread
	{
		public void run()
		{
			// TODO Auto-generated method stub
			while(true)
			{
				Thread th = Thread.currentThread();
				t2.setText(String.valueOf(j));
				if(j==100)
					j=0;
				else
					j++;
				
				 try 
				 {
					Thread.sleep(10);	
				 } 
				 catch (Exception e)
				 {	
				}
			}
		}
	}
		
}
