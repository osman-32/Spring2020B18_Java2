package day48_Abstraction;

public interface Interface2 {
    int a = 100; //this is not an instance variable, this is static and final variable
                // it is not possible to have instance variable

  //  public Interface2(){ } ==> interface cannot have a constructor
  //  public void method1(){} ==>  no instaance method

   // { } ==> no instance block in interface

    // static { } ==> not static block in interface

    public static void main(String[] args) {
        System.out.println(a); //by default static
       // a=200; // by default it is final

        System.out.println(Interface2.a);
        Interface2.method4();
    }
     static void method4(){ }

     void method5();

    default void method6(){
        System.out.println("Default method");
    } // default method can be used ONLY in interface
}
