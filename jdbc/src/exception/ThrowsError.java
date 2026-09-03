package exception;

public class ThrowsError {

	public static void main(String[] args) {
		try {
			int age=15;
			if(age<18) {
				throw new IllegalAccessException("not eligible to vote") ;
			}
		}catch(IllegalAccessException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
