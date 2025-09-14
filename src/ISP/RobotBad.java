package ISP;

public class RobotBad implements WorkerBad{
    public void work(){
        System.out.println("Robot is working");
    }

    public void eat(){
        System.out.println("Robot don't eat");//it will work but logically it's incorrect
    }
}
