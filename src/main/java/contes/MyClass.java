package contes;

public class MyClass {

    public static MyClass myClass = new MyClass();

    private MyClass() {}
    
    public static MyClass getInstance() {
        return new MyClass();
    }
    
}
