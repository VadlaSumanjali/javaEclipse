package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of arraylist");
		int s=sc.nextInt();
		for(int i=0;i<s;i++) {
			int j=sc.nextInt();
			list.add(j);
		}
		Collections.sort(list);
		System.out.println("Ascending: " + list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Descending: " + list);

		

	}

}
