package day48_Abstraction;

interface A1{
        void method1(); //public
}

interface B1{
        abstract int method2(); //public
}

interface C1{
    public abstract void method3(); //public
}


public class Abstraction02 implements A1, B1{
    public void method1(){
        System.out.println("A1");
    }

    public int method2(){
        System.out.println("B1");
        return 10;
    }

    public void method3(){
        System.out.println("C1");
    }
}
