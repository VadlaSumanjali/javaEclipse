package ArrayList;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of arraylist");
		int s=sc.nextInt();
		for(int i=0;i<s;i++) {
			int j=sc.nextInt();
			list.add(j);
		}System.out.print(list);
		for(int i=0;i<s/2;i++){
			int left=list.get(i);
			int right=list.get(s-i-1);
			list.set(i, right);
			list.set(s-i-1, left);
		} 
		System.out.print(list);

	}

}
