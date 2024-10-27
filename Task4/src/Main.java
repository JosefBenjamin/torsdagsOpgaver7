public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(10);
        Shape square = new Square(100);

        circle.getArea();
        square.getArea();

        ShapeBuilder x = new ShapeBuilder();
        x.addShape(circle);
        x.addShape(square);
        x.getTotalArea();


    }

}
