package com.MouseMotionListner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main extends Frame{
Button b1,b2;
TextField t;
public void main() {
add(b1=new Button("Click"));
add(t = new TextField());
add(b2=new Button("Clear"));

b1.addActionListener((e) -> t.setText("Hello World"));
b2.addActionListener((e) -> t.setText("  "));

addWindowListener(new WindowAdapter() {

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
});
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Main m= new Main();
		m.main();
	}
}

