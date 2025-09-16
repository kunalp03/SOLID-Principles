package DIP;

public class LighBulbGood implements SwitchableGood{
    public void turnOn(){
        System.out.println("Lightbuld is ON");
    }

    public void turnOff(){
        System.out.println("Lightbulb is OFF");
    }
}
