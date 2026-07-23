package ArrayList;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(9);
		list.add(8);
		list.add(1);
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int temp=list.get(i);
			if(!res.contains(temp)) {
				res.add(temp);
			}
		}System.out.print(list);
		System.out.println(res);

	}

}
