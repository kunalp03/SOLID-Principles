package OCP;

public class CircleGood implements ShapeGood{
    double radius;

    CircleGood(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}
