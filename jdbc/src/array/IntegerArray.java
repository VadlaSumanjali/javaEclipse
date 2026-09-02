package array;

public class IntegerArray {

	public static void main(String[] args) {
		//question 1
		int[] arr=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//question 2
		System.out.println();
		String[] str=new String[4];
		str[0]="john";
		str[1]="alice";
		str[2]="bob";
		str[3]="3emma";
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		
		//question 3
		System.out.println();
		double[] d=new double[3];
		d[0]=10.5;
		d[1]=20.75;
		d[2]=30.25;
		
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+" ");
		}
		
		//question 4
		System.out.println();
		char[] c=new char[5];
		c[0]='A';
		c[1]='B';
		c[2]='C';
		c[3]='D';
		c[4]='E';
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		//question 5
		System.out.println();
		boolean[] b=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
		//question 6
		System.out.println();
		int[] n=new int[5];
		n[0]=5;
		n[1]=15;
		n[2]=25;
		n[3]=35;
		n[4]=45;
		
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		
		//question 7
		System.out.println();
		String[] city=new String[3];
		city[0]="delhi";
		city[1]="mumbai";
		city[2]="chennai";
		
		for(int i=0;i<city.length;i++) {
			System.out.print(city[i]+" ");
		}
		
		//question 8
		System.out.println();
		float[] f=new float[4];
		f[0]=1.1f;
		f[1]=2.2f;
		f[2]=3.3f;
		f[3]=4.4f;
		
		for(int i=0;i<f.length;i++) {
			System.out.print(f[i]+" ");
		}
		
		//question 9
		System.out.println();
		long[] l=new long[3];
		l[0]=100000l;
		l[1]=200000l;
		l[2]=300000l;
		
		for(int i=0;i<l.length;i++) {
			System.out.print(l[i]+" ");
		}
		
		//question 10
		System.out.println();
		short[] s=new short[4];
		s[0]=100;
		s[1]=200;
		s[2]=300;
		s[3]=400;
		
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}

}
