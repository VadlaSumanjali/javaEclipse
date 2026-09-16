package strings;

public class WordsCount {

	public static void main(String[] args) {
		String s="Java programming language";
//		int count=0;
//		String r="";
//		for(char c:s.toCharArray()) {
//			
//			if(c==' ') {
//				if(r.length()>0) {
//					count++;
//				}r="";
//			}else {
//				r+=c;
//			}
//		}if(r.length()>0) {
//			count++;
//		}
//		System.out.println(count);
		
		String[] word=s.split(" ");
//		System.out.println(word.length);
//		for(String w:word) {
//			String rev="";
//			for(int i=w.length()-1;i>=0;i--) {
//				rev+=w.charAt(i);
//			}System.out.print(rev+" ");
//		}
		
		int len=0;
		int c=0;
		for(int i=word.length-1;i>=0;i--) {
//			System.out.print(word[i]+" ");
			if(word[i].length()>len) {
				len=word[i].length();
				c=i;
			}
		}System.out.println(word[c]);
		
//		int len=0;
//		for(String w:word) {
//			if(w.length()>len) {
//				len=w.length();
//				
//			}
//		}System.out.println(len);
		
	}

}
