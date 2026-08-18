package day4;

import java.util.Scanner;

class Plane{
	void fly() {
		System.out.println("flying");
	}
}
class CargoPlane extends Plane{
	void fly() {
		System.out.println("cargoplane is flying at low rate");
	}
}
class PassengerPlane extends Plane{
	void fly() {
		System.out.println("passengerplane is flying at medium height");
	}
}
class Fighter extends Plane{
	void fly() {
		System.out.println("Fighter is flying at high height");
	}
}
public class Flying {

	public static void main(String[] args) {
//		CargoPlane c=new CargoPlane();
//		c.fly();
//		
//		PassengerPlane p=new PassengerPlane();
//		p.fly();
//		
//		Fighter f=new Fighter();
//		f.fly();  
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		if(s.equals("CargoPlane")) {
			CargoPlane c=new CargoPlane();
			c.fly();
		}else if(s.equals("PassengerPlane")) {
			PassengerPlane p=new PassengerPlane();
			p.fly();
		}else {
			Fighter f=new Fighter();
			f.fly(); 
		}

	}

}
