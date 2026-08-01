package Inheritance;
class Computer{
	void showBrand() {
		System.out.println("brand :dell");
	}
}
public class Laptop extends Computer {
	void showModel() {
		System.out.println("model xps 15");
	}

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.showModel();
		l.showBrand();

	}

}
