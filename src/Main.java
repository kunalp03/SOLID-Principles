import DIP.DIPDemo;
import ISP.ISPDemo;
import LSP.LSPDemo;
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

//      LISKOV SUBSTITUTION PRINCIPLE
        LSPDemo lsp = new LSPDemo();
        lsp.runBadLSP(); //Violates LSP
        lsp.runGoodLSP();

//      INTERFACE SEGREGATION PRINCIPLE
        ISPDemo isp = new ISPDemo();
        isp.runBadISP();
        isp.runGoodISP();

//      DEPENDENCY INVERSION PRINCIPLE
        DIPDemo dip = new DIPDemo();
        dip.runBadDIP();
        dip.runGoodDIP();
    }
}