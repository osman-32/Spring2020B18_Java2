package OfficeHours.Practice_05_20_2020;

class Test{
    public Test(int a){
        System.out.println("A");
    }
}

public class Constructor extends Test {
    public Constructor(){
        super(4);
        System.out.println("B");
    }


    public static void main(String[] args) {
        Constructor obj=new Constructor();
    }
}
