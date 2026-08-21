package threads;
class Counters extends Thread {

    int count = 0;

    void increment() {
        count++;
    }
}
public class RaceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counters c = new Counters();

		Thread t1 = new Thread(() -> {
		    for (int i = 0; i < 10; i++)
		        c.increment();
		});

		Thread t2 = new Thread(() -> {
		    for (int i = 0; i < 10; i++)
		        c.increment();
		});

		t1.start();
		t2.start();
	}

}
