
class Shape {
    public void calculateArea() {
        System.out.println("Area of the generic shape");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Shape genericShape = new Shape();

        
        System.out.println("Area of the generic shape:");
        genericShape.calculateArea();

        
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        
        System.out.println("Area of the rectangle:");
        rectangle.calculateArea();
    }
}
