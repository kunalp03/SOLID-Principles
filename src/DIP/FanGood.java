package DIP;

public class FanGood implements SwitchableGood{
    public void turnOn(){
        System.out.println("Fan is ON");
    }

    public void turnOff(){
        System.out.println("Fan is OFF");
    }
}
