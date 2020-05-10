package Turtles_Practice;

import java.util.Scanner;

public class printConsecutiveNumbers {
    /*
    Write a function:

that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
 However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
  If a number is divisible by more than one of the numbers: 2,3 or 5,
   it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
    For example, numbers divisible by both 2 and 3 should be replacée by
    CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int a=input.nextInt();
        int b=a;
        a=1;
        for(int i=b; i>=1; i--) {
            if(i!=b) System.out.println();
            if (a % 2 == 0) System.out.print("Codility");
            if (a % 3 == 0) System.out.print("Test");
            if (a % 5 == 0) System.out.print("Coders");
            if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0) System.out.print(a);
            a++;


        }

    }
}
