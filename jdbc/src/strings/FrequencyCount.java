package strings;

import java.util.HashMap;

public class FrequencyCount {

	public static void main(String[] args) {
		String s="programming";
		HashMap<Character, Integer> hmm=new HashMap<Character, Integer>();
		for(char ch:s.toCharArray()) {
			if(hmm.containsKey(ch)) {
				hmm.put(ch, hmm.get(ch)+1);
			}else {
				hmm.put(ch, 1);
			}
		}
		for(char ch:s.toCharArray()) {
			if(hmm.get(ch)>1) {
				System.out.println(ch);
				
			}
			
		}

	}

}
