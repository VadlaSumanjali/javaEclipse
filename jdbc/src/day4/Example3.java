package day4;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j++) {
				System.out.print(" ");
			}for(int k=0;k<i;k++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
