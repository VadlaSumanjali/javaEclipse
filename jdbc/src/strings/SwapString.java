package strings;

public class SwapString {

	public static void main(String[] args) {
		String s="suma";
		char[] arr=s.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
//		System.out.println(arr);
		for(char c:arr) {
			System.out.println(c);
		}

	}

}
