package Queue;
import java.util.*;
public class FirstNonRepeating {
	public static void main(String[] args) {
		String str="aabc";
		Queue<Character> q=new LinkedList<>();
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
			q.offer(ch);
			
		}
	}

}
