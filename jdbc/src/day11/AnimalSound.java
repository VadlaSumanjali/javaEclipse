package day11;
class Animal{
	public void sound() {
		System.out.println("the animal sounds");
	}
}
class Dog extends Animal{
	@Override 
	public void sound() {
		System.out.println("dog sounds");
	}
}
public class AnimalSound {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();

	}

}
