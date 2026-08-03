package Queue;
import java.util.PriorityQueue;
public class Example {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
//		pq.add(2);
//		pq.add(22);
//		pq.add(1);
		pq.offer(22); 
		pq.offer(1);
		pq.offer(2); 
		System.out.println(pq);
		pq.poll();
		pq.poll();
		System.out.println(pq);
		pq.poll();
		
		
	}

}
