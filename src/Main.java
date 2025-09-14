import OCP.OCPDemo;
import SRP.*;

public class Main {
    public static void main(String[] args) {

//      SINGLE RESPONSIBILITY PRINCIPLE
        SRPDemo srp = new SRPDemo();
        srp.runBadSRP();
        srp.runGoodSRP();

//      OPEN CLOSED PRINCIPLE
        OCPDemo ocp = new OCPDemo();
        ocp.runBadOCP();
        ocp.runGoodOCP();

    }
}