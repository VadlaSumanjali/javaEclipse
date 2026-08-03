package HashMap;
import java.util.*;
public class NonRepeating {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hmm=new HashMap<>();
		int[] arr= {1,2,3,4,5,1,2};
		for(int n:arr) {
			hmm.put(n,hmm.getOrDefault(n,0)+1);
		}
		for(int n:arr) {
			if(hmm.get(n)>1) {
				System.out.println(n);
				break;
			}
		}
		for(int n:hmm.keySet()) {
			System.out.println(n+"->"+hmm.get(n));
		}

	}

}
