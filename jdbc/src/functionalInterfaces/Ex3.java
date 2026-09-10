package functionalInterfaces;

import java.util.function.Function;

class Emp{
	String name;
	String employee;
	public Emp(String name, String employee) {
		super();
		this.name = name;
		this.employee = employee;
	}
	public String getName() {
		return name;
	}
	public String getEmployee() {
		return employee;
	}
	
	
}
public class Ex3 {

	public static void main(String[] args) {
		Function<Emp, String> fun=new Function<Emp, String>() {
			
			@Override
			public String apply(Emp t) {
				return t.name;
			}
		};
		Emp e=new Emp("suma", "se");
		System.out.println(fun.apply(e));
		
	}

}
