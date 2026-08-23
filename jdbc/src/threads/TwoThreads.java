package threads;
class A extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("A"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("B"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class TwoThreads {

	public static void main(String[] args) throws InterruptedException {
		A a=new A();
		B b=new B();
		a.start();
		a.join();
		b.start();
		b.join();

	}

}
