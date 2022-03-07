package duckSim;

import duckSim.FlyWithRocket;

public class MiniDuckSimulator {
    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehaviour(new FlyWithRocket());
        mallard.performFly();
    }
}
