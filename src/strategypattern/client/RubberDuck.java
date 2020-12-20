package strategypattern.client;

import strategypattern.behavior.fly.FlyNoWay;
import strategypattern.behavior.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duck!");
    }
}
