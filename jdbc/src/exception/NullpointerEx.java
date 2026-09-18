package exception;

public class NullpointerEx {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.toLowerCase());
			
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		System.out.println("hi");

	}

}
