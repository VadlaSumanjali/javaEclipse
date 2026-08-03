package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	
	}

}
