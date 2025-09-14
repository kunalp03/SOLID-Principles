package ISP;

public class ISPDemo {
    public void runBadISP(){
        System.out.println("=== BAD ISP Example ===");
        WorkerBad human = new HumanBad();
        human.work();
        human.eat();
    }

    public void runGoodISP(){
        System.out.println("=== GOOD ISP Example ===");
        WorkableGood human = new HumanGood();
        human.work();
//      human.eat(); not possible because reference is workablegood not humangood
        ((HumanGood) human).eat(); //still possible using typecasting

        WorkableGood robot = new RobotGood();
        robot.work();
    }
}
