package bitManipulation;

public class DinaryToBinart {

	public static void main(String[] args) {
		int decimal=5;
		String binary="";
		while(decimal>0) {
			int i=decimal%2;
			binary=i+binary;
			decimal/=2;
		}System.out.println(binary);

	}

}
