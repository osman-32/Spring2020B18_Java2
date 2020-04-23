package day10_Switch_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        //Scanner variableName= new Scanner(System.in);
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a byte number:");
        byte num1 = input.nextByte();
        String result="";
        result=(num1%2==0)?" is even number":" is odd number";
        System.out.println(num1+result);

    }
}
