package bitManipulation;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int decimal=0;
		int power=1;
		while(n>0) {
			int i=n%10;
			decimal+=i*power;
			power*=2;
			n/=10;
		}System.out.println(decimal);

	}

}
