package day9;
class VehicleInfo {
    String brand;
    int speed;

    VehicleInfo(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class CarInfo extends VehicleInfo {
    String model;

    CarInfo(String brand, String model, int speed) {
        super(brand, speed);
        this.model = model;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        CarInfo c = new CarInfo("Toyota", "Fortuner", 180);
        c.display();
    }
}