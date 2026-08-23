package threads;
class P extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
public class JoinThread {

	public static void main(String[] args) throws InterruptedException {
		P p=new P();
		p.start();
		p.join();
		System.out.println("thread p completed");

	}

}
