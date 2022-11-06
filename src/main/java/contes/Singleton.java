package contes;

public class Singleton {

    public static Singleton singleton;

    /*
     * Use eager instantiation
     * 
     * public static Singleton singleton = new Singleton();
     */

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    /*
     * Double-checked locking
     * 
     * public static Singleton getInstance() {
     * 
     * if (singleton == null) {
     * synchronized (Singleton.class) {
     * if (singleton == null) {
     * singleton = new Singleton();
     * }
     * }
     * }
     * 
     * return singleton;
     * }
     */


    /*
     * Synchronize the getInstance() method:
     * 
     * public static synchronized Singleton getIntance() {
     * 
     * if (singleton == null) {
     * singleton = new Singleton();
     * }
     * 
     * return singleton;
     * 
     * }
     */

}
