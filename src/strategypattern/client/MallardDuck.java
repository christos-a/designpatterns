package strategypattern.client;

import strategypattern.behavior.fly.FlyWithWings;
import strategypattern.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a mallard duck!");
    }
}
