package DIP;

public class SwitchBad {
    private LighBulbBad lighBulbBad = new LighBulbBad();

    public void operate(boolean on){
        if (on)
            lighBulbBad.turnOn();
        else
            lighBulbBad.turnOff();
    }
}
