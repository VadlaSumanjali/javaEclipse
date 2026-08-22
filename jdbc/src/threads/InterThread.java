package threads;
//class Q{
//	int num;
//	public void put(int num) {
//		System.out.println("put "+num);
//		this.num=num;
//	}
//	public int get() {
//		System.out.println("get " + num);
//	}
//}
//class Producer implements Runnable{
//	Q q;
//
//	public Producer(Q q) {
//		super();
//		this.q = q;
//		Thread t=new Thread(this,"producer");
//		t.start();
//	}
//	public void run() {
//		int i=0;
//		while(true) {
//			q.put(i++);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//		}
//	}
//}
//class Consumer implements Runnable{
//	Q q;
//
//	public Consumer(Q q) {
//		this.q = q;
//		Thread t=new Thread(this,"consumer");
//		t.start();
//	}
//
//	@Override
//	public void run() {
//		while(true) {
//			q.get();
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//		}
//		}
//	}
//		
//	
//	
//}
public class InterThread {

	public static void main(String[] args) {
//		Q q=new Q();
//		new Producer(q);
//		new Consumer(q);
		System.err.println("hi");

	}

}
