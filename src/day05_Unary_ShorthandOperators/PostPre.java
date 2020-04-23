package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {
        //pre: changes the value of the variable immediately

        int a=100;
        System.out.println(++a);

        int b=100;
        System.out.println(--b); //99

        //Post: first passes the current value, then eventually changes the variable's value

        int A=100;
        System.out.println(A++); //100
        System.out.println(A); //101

        int B=100;
        System.out.println(B--); //100
        System.out.println(B);

        //post&pre example
        int z=10;
        int x=++z; //11

        System.out.println(z); //11
        System.out.println(x); //11

        int s=10;
        int f=s++; //10, after line 31, the value of s will be increased by 1

        System.out.println(f); //10
        System.out.println(s); //11

        double t1=3.5;
        double t2=t1--;
        System.out.println(t1);
        System.out.println(t2);

        int num=25;
        System.out.println(num++); //25
        System.out.println(num--); //26
    }
}
