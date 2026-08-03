package LinkedList;
import java.util.*;
public class Listexample {

	public static void main(String[] args) {
//		List<Integer> num=Arrays.asList(1,2,3,4,5,2,1);
//		LinkedHashSet<Integer> un=new LinkedHashSet<>(num);
//		System.out.println(un);
		int[] arr= {4,3,5,1,3,2,5,1,2};
		HashSet<Integer> hs=new HashSet<>();
		for(int a:arr) {
			if(hs.contains(a)) {
				System.out.println(a);
				break;
			}hs.add(a);
		}

	}

}
