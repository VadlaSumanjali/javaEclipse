package threads;

class Q {

    int num;
    boolean available = false;

    synchronized public void put(int num) throws InterruptedException {

        while (available) {
            wait();
        }

        System.out.println("put " + num);

        this.num = num;
        available = true;

        notify();
    }

    synchronized public int get() throws InterruptedException {

        while (!available) {
            wait();
        }

        System.out.println("get " + num);

        available = false;

        notify();

        return num;
    }
}


class Producer implements Runnable {

    Q q;

    public Producer(Q q) {
        this.q = q;

        Thread t = new Thread(this, "producer");
        t.start();
    }

    public void run() {

        int i = 0;

        while (true) {

            try {
                q.put(i++);

                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;

        Thread t = new Thread(this, "consumer");
        t.start();
    }

    @Override
    public void run() {

        while (true) {

            try {
                q.get();

                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class Demo {

    public static void main(String[] args) {

        Q q = new Q();
 
        new Producer(q);
        new Consumer(q);
    }
}