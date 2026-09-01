package exception;

public class Example1 {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int r=a/b;
			System.out.println(r);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("finished");
		}

	}

}
