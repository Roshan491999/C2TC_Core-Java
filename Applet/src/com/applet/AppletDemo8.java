package com.applet;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class AppletDemo8 extends Applet{
	public void init() {
		setLayout(new GridLayout(1,1));
		panel1 p = new panel1();
		p.panel2();
		add(p);
		panel2 q = new panel2();
		q.panel3();
		add(q);


	}
class panel1 extends Panel{
	Checkbox c1,c2,c3;
	
	CheckboxGroup cg=new CheckboxGroup();
	
	 public void panel2() {
		 setLayout(new GridLayout(3,1));
	 add(c1=new Checkbox("Tour1",cg,false));
	 add(c2=new Checkbox("Tour2",cg,false));
	 add(c3=new Checkbox("Tour3",cg,false));
	 }
}
class panel2 extends Panel{
	Checkbox c4,c5,c6;
	TextField t;
	
	public void panel3() {
		setLayout(new GridLayout(4,1));
		 add(c4=new Checkbox("manali"));
		 add(c5=new Checkbox("shimla"));
		 add(c6=new Checkbox("dalhousie"));
		 add(t=new TextField());
		 }
	
	
}
}
