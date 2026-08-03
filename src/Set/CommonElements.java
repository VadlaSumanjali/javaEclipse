package Set;
import java.util.*;
public class CommonElements {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {2,4,6,8,2,2,3,1};
		HashSet<Integer> hs=new HashSet<>();
		for(int n:arr1) {
			hs.add(n);
		}
		
		for(int n:arr2) {
			if(hs.contains(n)) {
				System.out.print(n+" ");
			}
		}

	}

}
