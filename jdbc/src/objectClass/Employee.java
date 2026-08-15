package objectClass;

public class Employee {
	int id=111;
	int a=111;
	
	
	
//	public int hashCode() {
//		return id*31;
//	}

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.hashCode());
		System.out.println(e.hashCode());
		

	}

}
