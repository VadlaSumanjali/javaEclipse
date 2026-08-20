package day9;
class ShapeInfo {
}

class RectangleInfo extends ShapeInfo {
    int length;
    int breadth;

    RectangleInfo(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class ShapeInheritance {
    public static void main(String[] args) {
        RectangleInfo r = new RectangleInfo(10, 5);
        r.calculateArea();
    }
}
