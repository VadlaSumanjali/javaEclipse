package functionalInterfaces;
import java.util.function.Consumer;
import java.util.function.Predicate;
class Employee{
	String name;
	String des;
	double salary;
	public Employee(String name, String des, double salary) {
		super(); 
		this.name = name;
		this.des=des;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getString() {
		return String;
	}
	public void setString(String string) {
		String = string;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", String=" + String + ", salary=" + salary + "]";
//	}
	
}
public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Employee> c=new Predicate<Employee>() {
			
			@Override
			public boolean test(Employee t) {
				return t.getSalary()>10000;
			}
		};
		Consumer<Employee> c1=new Consumer<Employee>() {
			
			@Override
			public void accept(Employee t) {
				t.setSalary(t.getSalary()+(t.getSalary()*0.10));
				System.out.println("updated salary "+t.getSalary());
			}
		};
		
		Employee e1=new Employee("sume", "se", 100000);
		Employee e2=new Employee("vasu", "teacher",1200000);
		Employee e3=new Employee("chary" , "driver", 12000);
		
		Employee[] e= {e1,e2,e3};
		for(Employee ee:e) {
			if(c.test(ee)) {
				c1.accept(ee);
			}
		}

	}
	

}
