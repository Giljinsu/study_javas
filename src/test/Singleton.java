package test;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }

    public void hi() {
        System.out.println("hi");
    }
}
