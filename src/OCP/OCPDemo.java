package OCP;

public class OCPDemo {
    public void runBadOCP(){
        System.out.println("=== BAD OCP Example ===");

        AreaCalculatorBad calculatorBad = new AreaCalculatorBad();
        RectangleBad rectangleBad = new RectangleBad(5, 10);
        CircleBad circleBad = new CircleBad(5);

        System.out.println("Rectangle area: "+calculatorBad.calculateArea(rectangleBad));
        System.out.println("Circle area: "+calculatorBad.calculateArea(circleBad));
    }

    public  void runGoodOCP(){
        System.out.println("=== GOOD OCP Example ===");

        AreaCalculatorGood calculatorGood = new AreaCalculatorGood();
        RectangleGood rectangleGood = new RectangleGood(5, 10);
        CircleGood circleGood = new CircleGood(5);

        System.out.println("Rectangle area: "+calculatorGood.calculateArea(rectangleGood));
        System.out.println("Circle area: "+calculatorGood.calculateArea(circleGood));
    }
}
