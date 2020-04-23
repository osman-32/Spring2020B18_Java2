package day13_StringClass;

import java.util.Scanner;

public class StringManipulations_Practice {
    /*
    input:cyBerTek sChooL
    output:
    Cybertek
    School
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName=input.nextLine(); //cyBerTek sChooL

        String firstName=fullName.substring(0,fullName.indexOf(" "));
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        System.out.println(firstName);



        //String lastName=fullName.substring(fullName.indexOf(" ")+1,fullName.length());
        String lastName=fullName.substring(fullName.indexOf(" ")+1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(lastName);

        /*
        Assignment:
        write me a program that asks the user first and last names, then prints the initials.
        ex:
        input: cybertek
                school
                output:
                CS
         */
        



    }
}
