package functionalInterfaces;
import java.util.function.Predicate;
public class Example2 {
	public static void main(String[] args) {
		Predicate<Integer> pre=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				
				return t%2==0;
			}
		};
		System.out.println(pre.test(56));

	}

}
