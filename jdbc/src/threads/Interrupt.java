package threads;

class MyTs extends Thread {

    public void run() {
 
        try {
            Thread.sleep(5000);

            System.out.println("Finished");

        } catch (InterruptedException e) {

            System.out.println("Thread interrupted");
        }
    }
}
public class Interrupt {

	public static void main(String[] args) {
		MyTs t = new MyTs();

        t.start();

        try {
			Thread.sleep(1000);
			System.out.println("finish");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        t.interrupt();
	}

}
