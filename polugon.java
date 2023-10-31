interface Polygon {
    double findArea(int dim1, int dim2);
}

class Rectangle implements Polygon {
    public double findArea(int dim1, int dim2) {
        return dim1 * dim2;
    }
}

class Triangle implements Polygon {
    public double findArea(int dim1, int dim2) {
        return 0.5 * dim1 * dim2;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of rectangle: " + rectangle.findArea(5, 7));

        Triangle triangle = new Triangle();
        System.out.println("Area of triangle: " + triangle.findArea(4, 6));
    }
}
