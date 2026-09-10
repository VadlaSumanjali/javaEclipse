package straems;

import java.util.Arrays;

public class Exampl1 {

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
//		Arrays.stream(num).forEach(n-> System.out.println(n));
//		Arrays.stream(num).filter(n->n%2==0).forEach(n->System.out.println(n));
		Arrays.stream(num).map(n->n*2).forEach(n->System.out.println(n));
		

	}

}
