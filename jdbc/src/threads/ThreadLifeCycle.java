package threads;
class Threads extends Thread{
	public void run() {
		System.out.println("thread is running");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread completed");
	}
}
public class ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		Threads t=new Threads();
		System.out.println(t.getState());
		t.start();
		Thread.sleep(100);
		System.out.println(t.getState());
		t.join();
		System.out.println(t.getState());
		System.out.println("main thread completed");

	}

}
