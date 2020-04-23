package day18_NestedLoop;

public class DivideTwoNumbers {
    /*
    Write a program that can divide two numbers. (Assume that first number is greater than the second)
    Note: Don not use division, multiplication, or module operators

    10/3==>with a reminder of 1
    10-3-3-3=1
     */
    public static void main(String[] args) {
        int a=10000;
        int a1=a;
        int b=0;
        int count=0;

        if (b==0){
            System.out.println("Divisor cannot be zero.");
            System.exit(0);
        }

        while (a>=b){
            count++;
            a-=b;
        }
        if (a==0) {
            System.out.println(a1 + " is divided by " + b + " the result is " + count);
        }else{
            System.out.println(a1 + " is divided by " + b + " the result is " + count + " and the remainder is " + a);
        }

    }
}
