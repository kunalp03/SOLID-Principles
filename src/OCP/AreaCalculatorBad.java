package OCP;

public class AreaCalculatorBad {
    // Violates OCP: every new shape requires modifying this method
    public  double calculateArea(Object shape){
        if(shape instanceof RectangleBad){
            RectangleBad r = (RectangleBad) shape;
            return  r.width*r.length;
        }
        else if(shape instanceof CircleBad){
            CircleBad c = (CircleBad) shape;
            return Math.PI* c.radius*c.radius;
        }
        return 0;
    }
}
