package com.applet;

import java.applet.Applet;
import java.awt.*;


public class AppletDemo extends Applet{
 Button b;
 TextField t;
   public void start() {b = new Button("submit");
   t = new TextField(20);
   add(b);
   add(t);
}}
