package com.applet;

import java.applet.*;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.TextField;

public class AppletDemo7 extends Applet
{
	 
	Checkbox c1,c2,c3,c4,c5,c6;
	CheckboxGroup cbg1;
	 
	TextField t;
	
	public void init() 
	{
		cbg1 = new CheckboxGroup();
		 
		setLayout(new GridLayout(4,2));
	add(c1= new Checkbox("tour1",cbg1,false));
	add(c2= new Checkbox("manali"));
    add(c3= new Checkbox("tour2",cbg1,false));
    add(c4= new Checkbox("shimla"));
	add(c5= new Checkbox("tour3",cbg1,false));
    add(c6= new Checkbox("dalhousie"));
	add(t=new TextField(5));
	
	
	}                                                                                                         
     
}
