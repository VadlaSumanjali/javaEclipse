package practiceQuestions;

class Vehical{
	void describe() {
	    System.out.println("This is a vehicle");
	}
}
class Car extends Vehical{
	void describe() {
	    System.out.println("This is a Car");
	    super.describe();

	}
}
public class VechiclelCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.describe();

	}

}
