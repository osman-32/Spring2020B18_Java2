package day47_Abstraction;

final class Test1{
    public Test1(){

    }
    public void method(){}

    public  static void method2(){}

    //public abstract void method3(){}
}

abstract class Test2{
    public Test2(){}

    public void method1(){}

    public static void method2(){}

    public abstract void method3();

    int a=100;

    static int b=200;

    {
        //Test2 obj=new Test2(); in abstract class cannot create an object
    }

    static {

    }
}

public class Abstract_Vs_NonAbstract {
}
