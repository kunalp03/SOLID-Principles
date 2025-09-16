package DIP;

public class SwitchGood {
    private final SwitchableGood device; //depends on abstraction

    public SwitchGood(SwitchableGood device){
        this.device = device;
    }

    public void operate(boolean on){
        if(on){
            device.turnOn();
        }
        else {
            device.turnOff();
        }
    }
}
