import java.util.ArrayList;

public class ShapeBuilder {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public double getTotalArea() {
        double totalArea = 0.0;
        for(Shape k : shapes) {
            totalArea += k.getArea();
        }
        System.out.println(totalArea);
        return totalArea;
    }

}
