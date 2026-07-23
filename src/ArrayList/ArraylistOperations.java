package ArrayList;
import java.util.*;
public class ArraylistOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.set(2, 5);
		list.remove(0);
		list.add(1,9);
		System.out.println(list);

	}

}
