package threads;
class C extends Thread{
	public void run() {
		while(true) {
			System.out.println("running...");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("thread interupted");
				break;
			}
		}
	}
}
public class RunningThread {

	public static void main(String[] args) throws InterruptedException {
		C c=new C();
		c.start();
		Thread.sleep(800);
		c.interrupt();
		

	}

}
 