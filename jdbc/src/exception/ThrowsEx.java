package exception;

public class ThrowsEx {
	static void fun() throws IllegalAccessException{
		System.out.println("inside fun");
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) {
		try {
			fun();
		}
		catch(IllegalAccessException e) {
			System.out.println("caught in main");
		}

	}

}
