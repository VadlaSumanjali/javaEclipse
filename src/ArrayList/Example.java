package ArrayList;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}
			if(list.get(i)<min) {
				min=list.get(i);
			}
		}System.out.print(max+"  "+min);

	}

}
