package Set;
import java.util.*;
public class FirstReapedElement {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		int[] arr= {1,2,3,1,4};
		for(int n:arr) {
			if(hs.contains(n)) {
				System.out.println(n);
				break;
			}hs.add(n);
		}

	}

}
