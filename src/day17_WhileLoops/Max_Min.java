package day17_WhileLoops;

import java.util.Scanner;

public class Max_Min {
    /*
    1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int MaxNumber=-99999999; // any number the user provided will be larger than this number
                                //first user entered variable will be initialized to MaxNumber
        int MinNumber=999999999;

        for (int i=1; i<6; i++){
            System.out.println("Enter a number");
            int num=input.nextInt();
            if(num>MaxNumber){
                MaxNumber=num;
            }
            if (num<MinNumber){
                MinNumber=num;
            }
        }
        System.out.println("The maximum number is "+MaxNumber);
        System.out.println("The minimum number is "+MinNumber);


    }
}
