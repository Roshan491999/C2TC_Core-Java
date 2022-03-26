package com.applet;

import java.applet.Applet;
import java.awt.*;


public class AppletDemo extends Applet{
 Button b;
 TextField t;
   public void init() {b = new Button("submit");
   t = new TextField();
   add(b);
   add(t);
}}
