package OCP;

public class AreaCalculatorGood {
    // Follows OCP: works with any shape implementing ShapeGood
    public double calculateArea(ShapeGood shape){
        return shape.area();
    }
}
