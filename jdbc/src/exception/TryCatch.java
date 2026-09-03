package exception;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("canout didvide by zero");
		}finally {
			System.out.println("completed");
		}

	}

}
