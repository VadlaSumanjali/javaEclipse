package streams;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
//		ArrayList<Integer> arr= new ArrayList<>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		
//		
//		Stream<Integer> st=arr.stream();
//		Stream<Integer> st1= st.filter(n->n%2==0);
//		st1.forEach(n->System.out.println(n));
		
//		ArrayList<Integer> numbers = new ArrayList<>();
//
//		numbers.add(10);
//		numbers.add(25);
//		numbers.add(55);
//		numbers.add(70);
//		numbers.add(35);
//		numbers.add(90);
//		numbers.add(45);
//		
//		Predicate<Integer> p=n->n>50;
//		numbers.stream()
//				.filter(p)
//				.forEach(n->System.out.println(n));
		
		ArrayList<String> names = new ArrayList<>();

		names.add("suma");
		names.add("anjali");
		names.add("rahul");
		names.add("arun");
		
		Function<String, String> f=n->n.toUpperCase();
		names.stream().map(f).forEach(n->System.out.println(n));
		

	}

}
