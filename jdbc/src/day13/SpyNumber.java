package day13;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		
		int sum=0;
		int pro=1;
		
		while(temp>0) {
			int d=temp%10;
			
			sum+=d;
			pro*=d;
			
			temp/=10;
		}
		if(sum==pro) {
			System.out.println("Spy Number");
		}else {
	            System.out.println("Not a Spy Number");
		}
	}

}
