package contes.Ducks;

import contes.Fly.FlyWithWings;
import contes.Quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I`m a real Mallard duck");
    }

    
}
