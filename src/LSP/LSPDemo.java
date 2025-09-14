package LSP;

public class LSPDemo {
    public void runBadLSP(){
        System.out.println("=== BAD LSP Example ===");
        BirdBad bird = new OstrichBad();
        bird.fly();
    }

    public void runGoodLSP(){
        System.out.println("=== GOOD LSP Example ===");
        FlyingBirdGood sparrow = new SparrowGood();
        sparrow.fly();
        sparrow.eat();

        BirdGood ostrich = new OstrichGood();
        ostrich.eat();
    }
}
