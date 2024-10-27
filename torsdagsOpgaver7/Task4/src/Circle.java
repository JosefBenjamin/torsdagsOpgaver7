import static java.lang.Math.PI;

public class Circle implements Shape {
    private double radius = 0.0;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        System.out.println(PI * (radius * radius));
        return PI * (radius * radius);
    }

}
