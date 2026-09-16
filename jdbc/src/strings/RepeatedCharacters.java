package strings;

import java.util.HashSet;

public class RepeatedCharacters {

	public static void main(String[] args) {
		String s="progrmming";
		HashSet<Character> set=new HashSet<Character>();
		for(char ch:s.toCharArray()) {
			if(set.contains(ch)) {
				System.out.println(ch);
				return;
			}set.add(ch);
		}System.out.println("no repeated character");

	}

}
