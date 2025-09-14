import SRP.*;

public class Main {
    public static void main(String[] args) {

//      SINGLE RESPONSIBILITY PRINCIPLE
        SRPDemo srp = new SRPDemo();
        srp.runBadSRP();
        srp.runGoodSRP();

    }
}