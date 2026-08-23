package threads;
class T extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("thread interruption");
			}
		}
	} 
}
public class PrintThread {

	public static void main(String[] args) {
        T t=new T();
        t.start();
	}

}
