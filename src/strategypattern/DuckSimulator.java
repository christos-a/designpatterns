package strategypattern;

import strategypattern.behavior.fly.FlyRockedPowered;
import strategypattern.client.Duck;
import strategypattern.client.MallardDuck;
import strategypattern.client.ModelDuck;

public class DuckSimulator {
    public static void runDuckSimulator() {
        System.out.println("Adding a new duck");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();

        System.out.println();
        System.out.println("Adding a new duck");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();

    }
}
