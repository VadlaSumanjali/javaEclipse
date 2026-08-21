package day11;

class Shapess {

    void area() {
        System.out.println("Shape area");
    }
}

class Circle extends Shapess {

    int radius = 5;

    @Override
    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shapess {

    int length = 10;
    int width = 5;

    @Override
    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

class Square extends Shapess {

    int side = 4;

    @Override
    void area() {
        System.out.println("Square Area: " + (side * side));
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Shapess s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();

        s = new Square();
        s.area();
    }
}