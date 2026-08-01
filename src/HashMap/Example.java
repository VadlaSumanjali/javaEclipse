package HashMap;

import java.util.HashSet;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.remove(2);
		//set.removeAll(set);
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println("nothing to return");

	}

}
