package day11_Switch_Scanner_Practice;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=input.nextInt();

        input.nextLine();
        System.out.println("Enter your full name:");
        String fullname=input.nextLine();
        System.out.println("Your full name is: "+fullname);
    }
}
