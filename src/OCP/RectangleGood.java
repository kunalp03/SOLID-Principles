package OCP;

public class RectangleGood implements ShapeGood{
    double length, width;

    RectangleGood(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return  length*width;
    }
}
