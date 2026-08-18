package threads;

class Counter{
	int count=0;
	synchronized
	 void inc() {
		count++;
	}
}
public class MtThread {

	public static void main(String[] args) throws InterruptedException{
		Counter c=new Counter();
		Thread t1=new Thread(() ->{
			for(int i=0;i<10;i++) c.inc();
		});
		Thread t2=new Thread(() ->{
			for(int i=0;i<10;i++) c.inc();
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
		
	}

}
