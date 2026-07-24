package LinkedList;
import java.util.*;
public class Expample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.addFirst(0);
		list.addLast(5);
		list.set(1, 20);
		System.out.println(list.get(0));
		System.out.println(list.getLast());
		System.out.println(list.remove(3));
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
