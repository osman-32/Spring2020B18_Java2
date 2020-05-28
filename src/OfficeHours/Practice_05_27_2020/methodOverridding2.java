package OfficeHours.Practice_05_27_2020;

public class methodOverridding2 {
    protected void method1(){

    }

    public static void method2(){

    }



}

class TestClass extends methodOverridding2{
    @Override
    protected void method1(){

    }
//    @Override
  //  public static void method2(){} static method cannot be overridden. Only instance method can be overridden.

}
