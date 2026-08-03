package Set;
import java.util.*;
public class UnionSet {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {2,5,6,3,1};
		HashSet<Integer> hs=new HashSet<>();
		for(int n:arr1) {
			hs.add(n);
		}
		for(int n:arr2) {
//			if(hs.contains(n)) {
//				hs.remove(n);
//			}else {
//				hs.add(n);
//			} remove the common elements
			hs.add(n);
		}
		System.out.println(hs);

	}

}
