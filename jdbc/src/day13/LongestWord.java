package day13;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		String word="";
		String lar="";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word=word+s.charAt(i);
			}
			else {
				if(word.length()>lar.length()) {
					lar=word;
				}word="";
			}
		}
		if (word.length() > lar.length()) {
	            lar = word;
	    }
		System.out.println(lar);

	}

}
