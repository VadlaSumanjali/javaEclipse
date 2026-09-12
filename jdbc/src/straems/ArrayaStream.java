package straems;

import java.util.*;
import java.util.stream.Stream;

public class ArrayaStream {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,3,4,5);
		
		int r=nums.stream()
		    .sorted()
		    .map(n->n*n)
		    .filter(n->n%2==0)
		    .reduce(0,(c,e)->c+e);
		System.out.println(r);
		    

	}

}
