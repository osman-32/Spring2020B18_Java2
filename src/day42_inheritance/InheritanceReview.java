package day42_inheritance;
class B{
    public B(int a){
        System.out.println("int");
    }

    public B(double a){
        System.out.println("double");
    }

    public B(long a){
        this(4.5);
        System.out.println("long");
    }
}

public class InheritanceReview extends B {
    public InheritanceReview(String a){
        super(4l);
        System.out.println("String");
    }

    public static void main(String[] args) {
        InheritanceReview obj=new InheritanceReview("a");
    }

}
