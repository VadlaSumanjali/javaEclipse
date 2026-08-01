package Inheritance;
class Person{
	Person(){
		System.out.println("person object created");
	}
}
class Student extends Person {
	Student(){
		System.out.println("student object created");
		
	}

	public static void main(String[] args) {
		Student s=new Student();

	}

}
