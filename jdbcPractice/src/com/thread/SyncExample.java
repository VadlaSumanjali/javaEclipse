package com.thread;
class Counter{
	int count=0;
	synchronized void increament() {
		count++;
	}
}
public class SyncExample {

	public static void main(String[] args) throws InterruptedException {
		Counter c= new Counter();
		Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    c.increament();
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
//		Counter c=new Counter();
//		Thread t1=new Thread(()->{
//			@Override
//			public void run() {
//				for(int i=0;i<10000;i++) {
//					c.increament();
//				}
//			} 
//		});

	}

}
