import SRP.EmailService;
import SRP.ReportService;
import SRP.UserManager1;
import SRP.UserManager2;

public class Main {
    public static void main(String[] args) {

//      SINGLE RESPONSIBILITY PRINCIPLE
        //Bad Example
        UserManager1 um1 = new UserManager1();
        um1.addUser("Kunal");
        um1.sendEmail();
        um1.generateReport();

        //Good Example
        UserManager2 um2 = new UserManager2();
        um2.addUser("Kunal");

        EmailService es = new EmailService();
        es.sendEmail();

        ReportService rs = new ReportService();
        rs.generateReport();

    }
}