package Stack;
import java.util.*;
public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.search(2));
		System.out.println(s.get(1));
		s.set(1, 11);
		System.out.println(s);

	}

}
