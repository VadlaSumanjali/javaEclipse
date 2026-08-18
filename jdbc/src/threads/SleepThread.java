package threads;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
		        System.out.println(i);
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class SleepThread {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();

	}

}
