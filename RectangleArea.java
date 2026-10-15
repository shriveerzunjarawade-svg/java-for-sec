class RectangleArea {
    double length;
    double breadth;

    double area() {
        return length * breadth;
    }
}


public class Main {
    public static void main(String[] args) {
        RectangleArea R = new RectangleArea();
        R.length = 5;
        R.breadth = 5;

        System.out.println("Area of Rectangle: " + R.area());
    }
}
