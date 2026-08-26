package conditions;

public class Smallestnumber {

	public static void main(String[] args) {
		int a=9;
		int b=8;
		int c=5;
		if(a<b & a<c) {
			System.out.println("a is smaller");
		}else if(b<a & b<c) {
			System.out.println("b id smaller");
		}else {
			System.out.println("c is smaller");
		}

	}

}
