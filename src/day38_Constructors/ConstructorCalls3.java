package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
       //this(8);
        System.out.println("Default");
       // this(8); constructor should call at the first line of the constructor
    }

    public ConstructorCalls3(int a){
        this(); // we call a construct, the constructor should not the current constructor
        // this(5); // a constructor cannot call it self
        System.out.println("Int argument");
    }

    public ConstructorCalls3(String str){
      // this("Hello"); // a constuctor cannot call it self
    }


    public static void main(String[] args) {
        ConstructorCalls3 obj=new ConstructorCalls3();

    }

    public void method1(){
        method1(); // a method can call itself
       // this(); a method cannot a call a constructor
    }

}
