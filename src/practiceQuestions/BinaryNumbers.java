package practiceQuestions;

import java.util.LinkedList;
import java.util.*;
public class BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
//		int r=1;
//		for(int i=0;i<n/2;i++) {
//			int a=r*10;
//			int b=a+1;
//			q.add(a);
//			q.add(b);
//			r=a;
//		}
//		System.out.println(q);
		for(int i=0;i<n;i++) {
			int c=q.poll();
			System.out.print(c+" ");
			q.offer(c*10);
			q.offer(c*10+1);
		}

	}

}
