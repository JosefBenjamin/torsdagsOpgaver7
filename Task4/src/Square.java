public class Square implements Shape{
    private double length = 0.0;

    Square(double length) {
        this.length = length;
    }

    public double getArea() {
        System.out.println(length * length);
        return length * length;
    }

}
