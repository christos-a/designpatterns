package strategypattern.behavior.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
}
