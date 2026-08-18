package encapsulation;
import java.util.*;
class Student{
	private String name;
	private int rollno;
	private int marks;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public int getMarks() {
		return marks;
	}
	
	

}

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s= new Student();
		
		System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
		s.setName(name);
		s.equals(rollNo);
		s.setMarks(marks);
		
		System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollno());
        System.out.println("Marks: " + s.getMarks());

	}

}
