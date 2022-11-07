package contes;

import contes.Ducks.Duck;
import contes.Ducks.MallardDuck;
import contes.Ducks.ModelDuck;
import contes.Fly.FlyRocketPowered;

public class App 
{
    public static void main( String[] args )
    {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
