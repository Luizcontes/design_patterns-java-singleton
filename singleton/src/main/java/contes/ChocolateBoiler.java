package contes;

public class ChocolateBoiler {
    
    private static ChocolateBoiler chocolateBoiler;
    private boolean empty;
    private boolean boiled;
    private double randomNumber;

    // public ChocolateBoiler() {
    //     empty = true;
    //     boiled = false;
    //     randomNumber = Math.floor(Math.random()*10);
    // }

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        randomNumber = Math.floor(Math.random()*10);
    }

    public static ChocolateBoiler getChocolateBoiler() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
    
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    @Override
    public String toString() {
        return "Random Number: " + randomNumber;
    }
}