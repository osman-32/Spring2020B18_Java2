package Turtles_Practice;

public class NumbersOddEven {
    /*
    Write  a method which can identifies given number is even or odd
     */
    public static void main(String[] args) {
        int a=45;
        System.out.println(a+" is an "+evenOdd(a)+" number");

    }

    public static String evenOdd(int a){
        String result= a%2==0?"even":"odd";
        return result;
    }
}
