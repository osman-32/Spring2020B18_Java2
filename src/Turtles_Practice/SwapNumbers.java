package Turtles_Practice;

public class SwapNumbers {
    /*
    Swap two variable' values without using a third variable
     */


    public static void main(String[] args) {
        int a=10;
        int b=25;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
