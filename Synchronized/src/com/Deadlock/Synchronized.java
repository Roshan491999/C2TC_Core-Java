package com.Deadlock;
class Content{
	public synchronized void m1(String s) {
		System.out.println("{");
		System.out.println(s);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
		}
	
		
		System.out.println("}");
		
		
	}
	
}
class Threadjob extends Thread{
	Content t;
	String s;
	public Threadjob(Content t ,String s) {
		this.t=t;
		this.s=s;
		start();
		
	}
	public void run() {
		t.m1(s);
	}
}
public class Synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Content t =new Content();
		new Threadjob(t,"hello");
		new Threadjob(t,"world");
	}

}
