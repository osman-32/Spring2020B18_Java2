package Turtles_Practice;

import java.util.Scanner;

public class Number_Slicing {
    /*
    In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 digits number");
        int i=input.nextInt();
       /* int digit1=i/10000;
        int digit2=(i%10000)/1000;
        int digit3=((i%10000)%1000)/100;
        int digit4=(((i%10000)%1000)%100)/10;
        int digit5=i%10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);

        */
        int result=0;
        for (int n=10000; n>0; n/=10){
            result=i/n;
            i=i%n;                              //8786
            System.out.println(result); //9
        }

    }
}
