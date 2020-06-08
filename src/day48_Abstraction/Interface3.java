package day48_Abstraction;

public interface Interface3 {
    public void method1();
    public abstract void method2();

    static final int num=100; // by default public

    int num2=300; // by default public, static, final

    public static void main(String[] args) {
       // method1(); // we cannot call an abstract method, it is for overriding
    }

    static void method(){}; // a static method cannot be abstract
}
