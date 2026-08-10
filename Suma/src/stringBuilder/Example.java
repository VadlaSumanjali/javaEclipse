package stringBuilder;

import java.util.StringTokenizer;

public class Example {

	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer();
//		System.out.println(sb.capacity());
//		sb.append("suma lllllll");
//		System.out.println(sb);
//		sb.append("vasu");
//		System.out.println(sb);
//		System.out.println(sb.capacity());
		
		StringTokenizer st=new StringTokenizer("hi ohellooii ppp", "o");
//		System.out.println(st.hasMoreElements());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());

		}

		

	}

}
