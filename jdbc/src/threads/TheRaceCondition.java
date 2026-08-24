package threads;
class Cou{
	int count=0;
	synchronized void increment() {
		count++;
	}
} 
class MYThreads extends Thread{
	 Cou c;
	 MYThreads(Cou c){
		 this.c=c;
	 } 
	 public void run() {
		 for(int i=0;i<10000;i++) {
			 c.increment();
//			 System.out.println(i);
		 } 
	 }
}
public class TheRaceCondition {

	public static void main(String[] args) throws InterruptedException {
		Cou c=new Cou();
		MYThreads t1=new MYThreads(c);
		MYThreads t2=new MYThreads(c);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("count "+c.count);

	}

}
