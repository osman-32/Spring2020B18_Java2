package day42_inheritance;

class Test{
    public Test(int a){
        System.out.println("A");
    }

    public Test(double a){
        System.out.println("C");
    }
}

public class Constructor2 extends Test {
    public Constructor2(){
        super(4.6);
        System.out.println("B");
    }

    public static void main(String[] args) {
        //Test obj=new Test(3);
        Constructor2 obj2=new Constructor2();
    }

}
