package day38_Constructors;

public class Test {

    public Test(){
        System.out.println("Constructor"); //static block executes only once and its execution depends on object
    }

    {
        System.out.println("Instance block"); //instance block execution allways depends on object
                                              //instance block executes before constructor
    }

    public static void main(String[] args) {

      new Test();
        System.out.println("Main method");
      new Test();
    }

    static{
        System.out.println("static block");
    }
}
