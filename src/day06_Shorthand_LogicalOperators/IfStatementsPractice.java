package day06_Shorthand_LogicalOperators;

public class IfStatementsPractice {
    public static void main(String[] args) {
        int a = 200;
        int b = 100;
        if (a > b) {
            System.out.println(a + " is greather than " + b);
        }
        if (b > a) {
            System.out.println(b + " is greather than " + a);
        }
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
        System.out.println("==============================================================");
        int x=300;
        int y=300;
        boolean xGreather=x>y;
        boolean yGreather=y>x;

        if(xGreather){
            System.out.println(x+" is greather than "+y);
        }
        if(yGreather){
            System.out.println(y+" is greather than "+x);
        }
        if(!xGreather&&!yGreather){
            System.out.println(x+" is equal to "+y);
        }
        


    }
}

