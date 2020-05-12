package day38_Constructors;

public class ConstructorPractice {
    public ConstructorPractice(){
        this(10.0);
        System.out.println("A");
        //this(0.5); a constructor should call at the first line of the constructor
    }

    public ConstructorPractice(int a){
        this();
        System.out.println("B");
    }

    public ConstructorPractice(double b){
      //  this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        ConstructorPractice obj=new ConstructorPractice(4);
    }
}
