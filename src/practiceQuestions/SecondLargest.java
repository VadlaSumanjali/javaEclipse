package practiceQuestions;

import java.util.Scanner;

public class SecondLargest {
	public static void printArrayelements(int arr[]){
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static int maximumnumber(int arr[]){
		int max = Integer.MIN_VALUE;
		int sec_max = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max ) {
				sec_max = max;
				max = arr[i];
			}
			else if(arr[i] > sec_max && arr[i] != max) {
				sec_max = arr[i];
			}
		}
		return sec_max + max;
	}
	
	
	public static int minimumnumber(int arr[]){
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
//		printArrayelements(arr);
		
		int res  = maximumnumber(arr);
		System.out.println(res);
		

	}

}
