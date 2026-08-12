package bitManipulation;

public class IthBitischecked {

	public static void main(String[] args) {
		int n=5;
		int i=2;
		if((n&(i<<1))!=0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
