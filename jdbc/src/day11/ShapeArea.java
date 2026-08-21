package day11;
class Shape{
	public void shape() {
		System.out.println("shape class");
	}
}
class Rectangle extends Shape{
	int length=20;
	int width=5;
	public void shape() {
		System.out.println("the length of rectangle "+(length*width));
	}
}
public class ShapeArea {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.shape();

	}

}
