package contes.Ducks;

import contes.Fly.FlyNoWay;
import contes.Quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I`m a model duck!");
    }
    
}
