package array2;
import java.util.*;
public class UniqueElement {
	public static void main(String[] args) {
		int[] arr= {1,2,1,2,3,4,1,3};
		HashSet<Integer> hs=new HashSet<>();
		HashMap<Integer,Integer> hm=new HashMap<>();
//		for(int i=0;i<arr.length;i++) {
//			if(!hs.contains(arr[i])) {
//				hs.add(arr[i]);
//			}else {
//				hs.remove(arr[i]);
//			}
//		}
//		System.out.println(hs);
		
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		for(int key:hm.keySet()) {
			if(hm.get(key)==1) {
				System.out.print(key+" ");
			}
		}
		
		
	}

}
