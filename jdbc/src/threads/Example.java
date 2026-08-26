package threads;
class W1 extends Thread{

	public void run(){
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
public class Example {

	public static void main(String[] args) throws InterruptedException {

		W1 w=new W1();
		w.start(); 
		Thread.sleep(3000);
		w.interrupt();
		w.join();
		System.out.println("main continous");
		
	}

}
