package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1(); //constructor can call static or insatance methods
        method2();

    }

    public ConstructorCalls(int a){
        //ConstructorCalls(); //we cannot a constructor into another constructor by its name. We should use "this()" key word.
             this();                                                                        //this. is used for instance variables
    }

    public static void method1(){
       // method2(); //static methods accepts only, static methods
        //ConstructorCalls(); // other methods cannot call constructors
    }

    public void method2(){
        method1();
        //ConstructorCalls(); // other methods cannot call constructors
    }


}
