package ISP;

public class HumanGood implements WorkableGood, EatableGood{
    public void work(){
        System.out.println("Human is working");
    }

    public void eat(){
        System.out.println("Human is eating");
    }
}
