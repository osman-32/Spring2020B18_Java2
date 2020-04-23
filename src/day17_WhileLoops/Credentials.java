package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter his/her username and password until user enters
correctly.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your user name");
        String username=input.next();

        System.out.println("Enter password");
        String password=input.next();

        boolean valid=(username.equals("cybertek") && password.equals("cybertek123"));
        int count=1;

        while(!valid){
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter username");
            username=input.next();

            System.out.println("Enter password");
            password=input.next();

            valid=(username.equals("cybertek") && password.equals("cybertek123"));
            count++;
            if(count==3 && !valid){
                System.out.println("You account is locked");
                break;
            }

        }
        if(valid){
            System.out.println("Logged in");
        }

    }
}
