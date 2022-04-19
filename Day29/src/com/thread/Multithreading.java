package com.thread;

class threading extends Thread {
	@Override
	public void run() {
		for (int i =0;i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			}
	}
	
}


public class Multithreading {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		for(int i=0 ; i<2 ;i++) {
		threading thr = new threading();
		///threading thr1 = new threading();
		thr.start();}
		//thr1.run();

	}

}
