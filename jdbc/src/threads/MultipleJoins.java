package threads;
class E implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("A"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class F implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("B"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultipleJoins {

	public static void main(String[] args) throws InterruptedException {
		 E e=new E();
		 Thread e1=new Thread(e);
		 
		 F f=new F();
		 Thread f1=new Thread(f);
		 
		 e1.start();
		 e1.join();
		 f1.start();
		 f1.join();
		 
		 System.out.println("completed... ");

	}

}
