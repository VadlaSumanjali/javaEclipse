package java8feactures;
@FunctionalInterface
interface ZeroParameter{
	void display();
}
public class Lambda {

	public static void main(String[] args) {
		ZeroParameter zero=()-> System.out.println("this is azero par lambda");
		zero.display();

	}

}
