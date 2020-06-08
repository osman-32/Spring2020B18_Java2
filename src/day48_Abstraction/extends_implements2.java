package day48_Abstraction;
interface P{
    void method1();
}

interface Q{
    void method2();
}

abstract class R{
    abstract void method3();
}

public class extends_implements2 extends R implements P, Q {
    public static void main(String[] args) {
       // R obj=new R(); not concrete, it is abstract, from an abstract class we can not create an object

        // Q obj2= new Q();  Q is interface, it doesn't have a constructor, so we cannot crete from an interface
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    void method3() {

    }
}
