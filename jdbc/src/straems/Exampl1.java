package straems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
 
public class Exampl1 {

	public static void main(String[] args) {
//		int[] num= {10,20,30,40,50};
//		Arrays.stream(num).forEach(n-> System.out.println(n));
//		Arrays.stream(num).filter(n->n%2==0).forEach(n->System.out.println(n));
//		Arrays.stream(num).map(n->n*2).forEach(n->System.out.println(n));
//		ArrayList<Integer> n=new ArrayList<>();
//		n.add(1);
//		n.add(2);
//		n.add(3);
//		n.add(4);
//		
//		n.stream().filter(n1->n1>2).forEach(n1->System.out.println(n1));
//		Stream<Integer> stream=Stream.of(10,20,30);
//		stream.forEach(n->System.out.println(n));
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(66);
		s.add(88);
		s.add(77);
		
//		s.stream().forEach(n->System.out.println(n));
		s.stream().filter(n->n%2==0).map(n->n*9).forEach(n->System.out.println(n));
		

	}

}
