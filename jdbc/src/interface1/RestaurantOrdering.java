package interface1;
interface FoodService{
	public void takeOrder();
	public void prepareFood();
	public void generateBill();
}
class Restaurant implements FoodService{

	@Override
	public void takeOrder() {
		System.out.println("order from restaurent");
	}

	@Override
	public void prepareFood() {
		System.out.println("prepare food from restaurent");
	}

	@Override
	public void generateBill() {
		System.out.println("restaurnt generateBill from restaurent");
	}
	
}
class Cafeteria implements FoodService{

	@Override
	public void takeOrder() {
		System.out.println("food ordered from cafeteria");	
	}

	@Override
	public void prepareFood() {
		System.out.println("food prepared from cafetaia");
	}

	@Override
	public void generateBill() {
		System.out.println("bill generated from cafeteria");
	}
	
}
class FoodCount implements FoodService{

	@Override
	public void takeOrder() {
		System.out.println("food ordered from foodcount");
	}

	@Override
	public void prepareFood() {
		System.out.println("food prepared from foodcount");
	}

	@Override
	public void generateBill() {
		System.out.println("generated bill from foodcount"); 
	}
	
}
public class RestaurantOrdering {

	public static void main(String[] args) {
		FoodService f;
		f=new Restaurant();
		f.takeOrder();
		f.prepareFood();
		f.generateBill();
		
		f=new Cafeteria();
		f.takeOrder();
		f.prepareFood();
		f.generateBill();
		
		f=new FoodCount();
		f.takeOrder();
		f.prepareFood();
		f.generateBill();
	}

}
