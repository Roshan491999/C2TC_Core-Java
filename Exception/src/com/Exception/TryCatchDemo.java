package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchDemo {
	public void m1() {
		try {
			Thread.sleep(200);
			new FileInputStream("");
			Class.forName("");
			System.in.read();
			
		}
		catch(InterruptedException e) {
		}
		catch(FileNotFoundException e) {
		}
		catch(ClassNotFoundException e) {
		}
		catch(Exception e) {
	
		}
		catch(Exception e) {
			if(e instanceof InterruptedException ) {
			}
			if(e instanceof FileNotFoundException ) {
			}
			if(e instanceof ClassNotFoundException ) {
			}
			
			
		}
	}

}
