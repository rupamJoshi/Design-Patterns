package duckSim;

import duckSim.FlyBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehavior ; 
    QuackBehavior quackBehavior;
    public Duck() {
    }
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehavior = flyBehaviour;
    }
}