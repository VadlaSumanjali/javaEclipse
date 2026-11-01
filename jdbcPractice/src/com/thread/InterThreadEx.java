package com.thread;
class Shared{
	synchronized void waitMethod() {
		try {
			System.out.println("thread is waiting");
			wait();
			System.out.println("thread resume");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	synchronized void notifyMethod() {
		System.out.println("sending notification...");
		notify();
	}

}
public class InterThreadEx {

	public static void main(String[] args) throws InterruptedException {
		Shared s= new Shared();
		Thread t1=new Thread(()->s.waitMethod()); 
		t1.start();
//		Thread.sleep(1000);
		s.notifyMethod();

	}

}
