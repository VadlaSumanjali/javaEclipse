package Inheritance;

class Animal {
    void display() {
        System.out.println("This is an animal");
    }
} 

class Dog extends Animal{
	
	public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
		
    }
}

