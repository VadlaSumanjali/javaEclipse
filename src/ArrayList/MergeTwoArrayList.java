package ArrayList;

import java.util.ArrayList;

public class MergeTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		ArrayList<Integer> res=new ArrayList<>();
		res.add(4);
		res.add(5);
		res.add(6);
		
		for(int i=0;i<res.size();i++) {
			list.add(res.get(i));
		}System.out.print(list);

	}

}
