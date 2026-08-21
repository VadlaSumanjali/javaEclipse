package absraction;
abstract class Vechicle{
	String modelName;
	int vechicalNumber;
	String company;
	
	Vechicle(String modelName, int vehicleNumber, String company) {
        this.modelName = modelName;
        this.vechicalNumber = vehicleNumber;
        this.company = company;
    }
	public abstract void startEngine();
	
	public void fuleType() {
		System.out.println("petro or diesel");
	}
	
}
class Bike extends Vechicle{
	boolean hasSidecar;
	Bike(String modelName,int vechicalNumber,String company,boolean hasSidecar ){
		super(modelName,vechicalNumber,company);
		this.hasSidecar=hasSidecar;
	}
	public void startEngine() {
		System.out.println("using kick-start or self-start mechanism");
	}	
}
class Truck extends Vechicle{
	int cargoCapacity;
	Truck(String modelName,int vechicalNumber,String company,int cargoCapacity ){
		super(modelName,vechicalNumber,company);
		this.cargoCapacity=cargoCapacity;
	}
	public void startEngine() {
		System.out.println("using heacy-loaf engine warm-up logic");
	}	
}

public class VechicalManagement {

	public static void main(String[] args) {
		 Bike b = new Bike("Pulsar", 101, "Bajaj", false);

		 System.out.println("Bike Details");
	     System.out.println("Model: " + b.modelName);
	     System.out.println("Vehicle Number: " + b.vechicalNumber);
	     System.out.println("Company: " + b.company);
	     System.out.println("Has Sidecar: " + b.hasSidecar);
	      
	     b.startEngine();
	     b.fuleType();

	     System.out.println();

	     Truck t = new Truck("Prima", 102, "Tata", 5000);

	     System.out.println("Truck Details");
	     System.out.println("Model: " + t.modelName);
	     System.out.println("Vehicle Number: " + t.vechicalNumber);
	     System.out.println("Company: " + t.company);
	     System.out.println("Cargo Capacity: " + t.cargoCapacity + " kg");

	     t.startEngine();
	     t.fuleType();

	}

}
