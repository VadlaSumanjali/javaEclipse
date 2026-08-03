package ArrayList;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		arr.set(1, 11);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(1);
		arr.removeAll(arr1);
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr.contains(1));

	}

}
