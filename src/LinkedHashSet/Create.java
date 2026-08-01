package LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedHashSet; 
public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> ls=new LinkedHashSet<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		Iterator<Integer> it=ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
