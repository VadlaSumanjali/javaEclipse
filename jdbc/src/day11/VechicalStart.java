package day11;
class Vechicle{
	public void start() {
		System.out.println("the vechical start");
	}
}
class Car extends Vechicle{
	public void start() {
		System.out.println("car start with the key");
	}
}
public class VechicalStart {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();

	}

}
