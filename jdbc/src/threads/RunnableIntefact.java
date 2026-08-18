package threads;
class Task implements Runnable {
	public void run() {
		System.out.println("thread is running");
	}
}
public class RunnableIntefact {

	public static void main(String[] args) {
		Task t=new Task();
		Thread task=new Thread(t);
		System.out.println(task.getPriority());
		task.start();

	}

}
