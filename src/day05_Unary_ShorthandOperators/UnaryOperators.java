package day05_Unary_ShorthandOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a=10; //positive 10
        int b=a;  //positive 10

        System.out.println(a);
        System.out.println(b);

        int a2=-10;
        boolean result1=a2>0;
        boolean result2=a2<0;
        System.out.println(result1); //false
        System.out.println(result2); //true

        int x1=-10;
        int y1=-x1; //-(-10)=10
        System.out.println(y1); //10

        int x2=+20;
        int y2=-x2; //-(+20)=-20
        System.out.println(y2);

        int x3=+20;
        int y3=+x3; //20

        int Z=100;
        System.out.println(++Z); //101

        int P=100;
        System.out.println(P++); //100
        System.out.println(P); //101


    }
}
