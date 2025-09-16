package DIP;

public class DIPDemo {
    public void runBadDIP(){
        System.out.println("=== BAD DIP Example ===");
        SwitchBad sw = new SwitchBad();
        sw.operate(true);
        sw.operate(false);
    }

    public void runGoodDIP(){
        System.out.println("=== GOOD DIP Example ===");

        SwitchGood lightSwitch = new SwitchGood(new LighBulbGood());
        lightSwitch.operate(true);

        SwitchGood fanSwitch = new SwitchGood(new FanGood());
        fanSwitch.operate(true);
    }
}
