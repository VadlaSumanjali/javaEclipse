
package Inheritance;

class Vehical {
	void run() {
		System.out.println("vehical is running");
	}
}
class Car extends Vehical{
	void speed() {
		System.out.println("car is moving at 80 km/h");
	}

	public static void main(String[] args) {
		Car c=new Car();
		c.run();
		c.speed();

	}

}
