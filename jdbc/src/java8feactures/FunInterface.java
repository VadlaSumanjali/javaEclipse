package java8feactures;

@FunctionalInterface
interface Calculator{
	int calculate(int a,int b);
}
public class FunInterface {
	public static void main(String[] args) {
		Calculator add=(a,b)->a+b;
		Calculator multiply=(a,b)-> a*b;
		Calculator sub=(a,b)->a-b;
		System.out.println("add "+ add.calculate(10, 5));
		System.out.println("mul "+multiply.calculate(2, 4));
		System.out.println("sub "+sub.calculate(44, 33));

	}

}
