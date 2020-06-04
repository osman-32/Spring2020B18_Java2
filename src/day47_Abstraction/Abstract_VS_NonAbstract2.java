package day47_Abstraction;

abstract class A{
    public abstract void method1();

    public void method2(){}

}

public class Abstract_VS_NonAbstract2 extends A { // MANDATORY to override the absract method of the extended class
// 2 methods, non of them is abstract
    @Override
    public void method1() {
        System.out.println("A");
    }
}

abstract class B extends A{ //optional to override the abstract method of A
// 2 methods, one abstract other non-abstract method


}

class C extends B{

    @Override
    public void method1() {

    }
}
