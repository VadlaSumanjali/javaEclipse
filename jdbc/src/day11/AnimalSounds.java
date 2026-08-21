package day11;
class Animal{
	public void sound(){
		System.out.println("the animal sounds");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("the dog barks");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("the cat meow");
	}
}
class Cow extends Animal{
	public void sound() {
		System.out.println("the cow moo");
	}
}
public class AnimalSounds {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		
		Cat c=new Cat();
		c.sound();
		
		Cow co=new Cow();
		co.sound();

	}

}
