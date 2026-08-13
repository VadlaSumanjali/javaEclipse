package referance;
class A{
	public void show1() {
		System.out.println("class a");
	}
}
class B extends A{
	public void show2() {
		 System.out.println("class b");
	}
}
public class Demo {

	public static void main(String[] args) {
		A a=new A();
		a.show1();

	}

}
