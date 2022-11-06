package contes;

public final class App {

    public static void main(String[] args) {

        
        for (int i=0; i<5; i++) {
            ChocolateBoiler choco = ChocolateBoiler.getChocolateBoiler();
            System.out.println(choco);
        }
    }
}
