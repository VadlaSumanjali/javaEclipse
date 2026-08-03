package LinkedHashSet;
import java.util.LinkedHashMap;
public class Frequecy {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> hm=new  LinkedHashMap<>();
		int[] arr= {1,2,3,4,1,2};
		for(int n:arr) {
			hm.put(n,1);
		}
		System.out.println(hm);
		

	}

}
