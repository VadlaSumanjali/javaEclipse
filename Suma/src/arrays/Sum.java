package arrays;

import java.util.Scanner;

public class Sum {
	static void print(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}System.out.println(sum);
	}
	static void printeven(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]&1)==0) {  
			  sum+=arr[i];
			}
		}System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		print(arr);
		printeven(arr);

	}

}
