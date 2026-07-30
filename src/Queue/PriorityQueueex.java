package Queue;
import java.util.PriorityQueue;
public class PriorityQueueex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p=new PriorityQueue<>();
		p.add(5);
		p.add(3);
		p.add(4);
		System.out.print(p.peek());
		//peek return the smallest valaue
		//poll removes the smallest value
		System.out.println(p.poll());
		System.out.println(p.remove(0));
		//removes based on the given element
		System.err.println(p.contains(4));
		
		
		
	}

}
