package OfficeHours.Practice_05_20_2020;

class TestData{
    int num=100;
    String name="Cybertek";

    public void method(){
        System.out.println("Cybertek School");
    }
}

public class SuperKeyword2 extends TestData {
    int num=200;
    String name="MIT";

    public void method(){
        System.out.println("MIT school");
    }

    public SuperKeyword2(){
        super.method();
        System.out.println(this.num);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        SuperKeyword2 obj=new SuperKeyword2();
    }

}
