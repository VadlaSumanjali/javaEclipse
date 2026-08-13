package updownCast;
class P{
	public void show1() {
		System.out.println("class p");
	}
	
}
class C extends P{
	public void show1() {
		System.out.println("class c");
	}
}
public class Demo {

	public static void main(String[] args) {
//		P p=new P();
//		p.show1();
		
		P p=new C();
		p.show1();
		C c=(C) p;
		c.show1();
		 

	}

}
