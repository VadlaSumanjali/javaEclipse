package day13;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sq=n*n; 
		int sum=0;
		
		while(sq>0) {
			sum+=sq%10;
			sq/=10;
		}
		if(sum==n) {
			System.out.println("neon number");
		}else {
			System.out.println("not a neon number");
		}

	}

}
