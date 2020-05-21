package day43_MethodOverriding;

class Test{
    public void method(){
        System.out.println("Onur");
    }

}

public class MethodOverridding extends Test {
        @Override
    public void method(){
        System.out.println("Zarina");
    }

    public static void main(String[] args){
        Test obj1=new Test();

        obj1.method();

        MethodOverridding obj2=new MethodOverridding();
        obj2.method();
    }


}
