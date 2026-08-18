package encapsulation;
import java.util.*;
class Person{
	private int age;
	public void setAge(int age) {
		if(age>=1 & age<=100) {
			this.age=age;	
		}else {
			System.out.println("enter the correct age");
			return;
		}
		
	}
	public int getAge() {
		return age;
	}
}
public class PersonAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Person p = new Person();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        p.setAge(age);

        System.out.println("Age: " + p.getAge());

        sc.close();

	}

}
