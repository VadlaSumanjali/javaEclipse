package Vector;
import java.util.*;
public class CreateVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		System.out.println(v.capacity());
		System.out.println(v.get(0));
		System.out.println(v.remove(1));
		v.set(0, 21);
		System.out.println(v.size());
		v.clear();
		System.out.println(v);
		
	}

}
