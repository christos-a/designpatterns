package strategypattern.client;

import strategypattern.behavior.fly.FlyNoWay;
import strategypattern.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm a decoy duck!");
    }
}
