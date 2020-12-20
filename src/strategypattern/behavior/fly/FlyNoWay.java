package strategypattern.behavior.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
