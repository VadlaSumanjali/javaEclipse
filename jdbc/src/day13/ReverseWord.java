package day13;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		int idx=s.length();
		
		while(idx>0) {
			int space=s.lastIndexOf(" ",idx-1);
			if(space==-1) {
				System.out.println(s.substring(0, idx));
				break;
			}
			System.out.print(s.substring(space+1,idx)+" ");
			idx=space;
		}

	}

}
