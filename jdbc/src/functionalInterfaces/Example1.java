package functionalInterfaces;

import java.util.function.Consumer;

//class Demo implements Consumer<String>{
//
//	@Override
//	public void accept(String t) {
//		System.out.println(t);
//		
//	}
//	
//}
public class Example1 {

	public static void main(String[] args) {
		Consumer<String> consumer=new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		};
		consumer.accept("java");
		
		
//		Consumer<String> consumer=new Demo();
//		consumer.accept("hi");

	}

}
