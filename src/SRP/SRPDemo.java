package SRP;

public class SRPDemo {
    public void runBadSRP(){
        UserManager1 um1 = new UserManager1();
        um1.addUser("Kunal");
        um1.sendEmail();
        um1.generateReport();
    }

    public  void runGoodSRP(){
        UserManager2 um2 = new UserManager2();
        um2.addUser("Kunal");

        EmailService es = new EmailService();
        es.sendEmail();

        ReportService rs = new ReportService();
        rs.generateReport();
    }
}
