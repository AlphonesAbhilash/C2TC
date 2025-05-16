package com.tns.multiThreading;

public class ThreadClass extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
