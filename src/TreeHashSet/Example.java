package TreeHashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class Example {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<>();
		s.add(1);
		s.add(22);
		s.add(34);
		s.add(11); 
		System.out.println(s);
		s.add(12);
		System.out.println(s);
		System.out.println(s.lower(1));
		System.out.println(s.last());
		s.remove(22);
		System.out.println(s);
		s.pollFirst();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
