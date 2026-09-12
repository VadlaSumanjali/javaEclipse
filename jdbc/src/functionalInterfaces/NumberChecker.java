package functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

interface NumCheck{
	boolean checkNum(int num);
}
interface CharCheck{
	void checkChar(char ch);
}
public class NumberChecker {
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}for(int i=2;i*i<n;i++) {
			if(n%1==0) {
				return false;
			}
		}return true;
	}

	public static void main(String[] args) {
		NumCheck num=n->{return isPrime(n);};
		System.out.println(num.checkNum(11));
		
		CharCheck c=ch->System.out.println(isPrime(ch));
		c.checkChar('A');
		
		Consumer<Integer> cs=new
		
		
		
		
		
		
		
//		NumCheck num=new NumCheck() {
//			 @Override
//			 public boolean checkNum(int t) {
//				 boolean isprime=true;
//					if(t<2) {
//						return false;
//					}else {
//						for(int i=2;i<t;i++) {
//							if(i%t==0) {
//								return false;
//							}
//						}
//					}
//					return isprime;
//			 }
//		};
//		
//		CharCheck c=new CharCheck() {
//			
//			@Override
//			public void checkChar(char ch) {
//				int a=(int)ch;
//				System.out.println(a);
//				
//			}
//		};
//		System.out.println(num.checkNum(13));
//		c.checkChar('k');
		
		
//		Predicate<Integer> p=new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer t) {
//				boolean isprime=true;
//				if(t<2) {
//					return false;
//				}else {
//					for(int i=2;i<t;i++) {
//						if(i%t==0) {
//							return false;
//						}
//					}
//				}
//				return isprime;
//			}
//		};
//		System.out.println(p.test(13));
	}

}
