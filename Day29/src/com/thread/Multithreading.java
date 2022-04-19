package com.thread;

class threading  implements Runnable
{
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
		for(int i=0 ; i<4 ;i++) {
		threading thr = new threading();
		Thread t =new Thread(thr);    //if implements Runnable
		///threading thr1 = new threading();
		t.start();}
		//thr1.run();

	}

}
