package day42_inheritance;

class A{
    int a=100;
    public A(double b){
        System.out.println(this.a);
    }
}

public class SuperKeyword extends A {
    int a=200;
    public SuperKeyword(){
     super(4);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        //SuperKeyword sup=new SuperKeyword();
        A obj2=new A(4);
    }
}
