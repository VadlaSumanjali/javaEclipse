package threads;
class Co{
	int count;
	public synchronized void increment() {
		count++;
	}
}
public class SyncDemo {

	public static void main(String[] args) throws Exception  {
		Co c=new Co();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				 for(int i=0;i<1000;i++) {
					 c.increment();
				 }
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				 for(int i=0;i<1000;i++) {
					 c.increment();
				 }
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("count "+c.count);

	}

}
