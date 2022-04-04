package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Event;

public class AppetDemo9 extends Applet
{
	A a1;
	B b1;
public void init() 
	{
	setLayout(new GridLayout(1,1));
		add(a1 =new A());
		
		add(b1=new B());
		}

		public boolean action ( Event e, Object O)  {
			
			if(e.target.equals(a1.b1)) {
				int a=1 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n" );
					
					b++;
					}
			
						}
			if(e.target.equals(a1.b2)) {
				int a=2 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n");
					b++;
			}
				}
			
			if(e.target.equals(a1.b3)) {
				int a=3 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n");
					b++;
			}
				}
			
			if(e.target.equals(a1.b4)) {
				int a=4 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n");
					b++;
			}
				}
			
			if(e.target.equals(a1.b5)) {
				int a=5 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n");
					b++;
			}
				}
			
			if(e.target.equals(a1.b6)) {
				int a=6 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n");
					b++;
			}
				}
			
			if(e.target.equals(a1.b7)) {
				int a=7 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n");
					b++;
			}
				}
			
			if(e.target.equals(a1.b8)) {
				int a=8 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n");
					b++;
			}
				}
			
			if(e.target.equals(a1.b9)) {
				int a=9 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n");
					b++;
			}
				}
			
			if(e.target.equals(a1.b10)) {
				int a=10 , b=1 , c;
				b1.t.setText("");
				while(b<=10) {
					c =a*b;
					b1.t.append(" \n "+c+" \n");
					b++;
			}
				}
		
			return true;
		
	}
		
	 class A extends Panel{
		 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
		 public A() {
			 setLayout(new GridLayout(10,1));
			add(b1 = new Button("1"));
			add(b2 = new Button("2"));
			add(b3 = new Button("3"));
			add(b4 = new Button("4"));
			add(b5 = new Button("5"));
			add(b6 = new Button("6"));
			add(b7 = new Button("7"));
			add(b8 = new Button("8"));
			add(b9 = new Button("9"));
			add(b10 = new Button("10"));
			 
		 }
		 }
   class B extends Panel {
				 TextArea t;
				 public B(){
					 setLayout(new GridLayout(1,1));
				 add(t = new TextArea());
				 }
				 
			 }
		 
		 
		
			
		
		
	
	  
	
}


