class Shape {
    public void calculateArea() {
        System.out.println("Area calculation for generic shape (not implemented)");
    }
    
    public void calculateArea(double radius) { // For circles (assuming radius is available)
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override // Optional annotation to indicate intended overriding
    public void calculateArea() {
        double area = width * height;
        System.out.println("Area of rectangle: " + area);
    }
}
public class MethodOverloadingOverridingDemo {

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calculateArea();
        shape.calculateArea(5.0);  // Prints "Area calculation for generic shape (not implemented)"

        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.calculateArea(); // Prints "Area of rectangle: 15.0"
    }
}
