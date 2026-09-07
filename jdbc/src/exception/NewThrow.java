package exception;

public class NewThrow {

	public static void main(String[] args) {
		int num=1;
		int den=0;
		
	try {
		if(den==0) {
			throw new ArithmeticException("cannot divide by zero");
		}else {
			System.out.println(num/den);
		}
	}//catch(ArithmeticException e) {
//		System.out.println("error");
//	}
	finally {
		System.out.println("code");
	}
		

	}

}
