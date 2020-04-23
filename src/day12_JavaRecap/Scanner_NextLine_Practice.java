package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //7921 JonesBranch Dr. Mclean VA, 22034
        // fullAddress: Building-number Street City, state zipcode

        System.out.println("Building Number: ");
        int Bnumber=input.nextInt();

        System.out.println("Street: ");
        input.nextLine();
        String street=input.nextLine();

        System.out.println("Street is :"+street);

        System.out.println("Enter the zip code: ");
        int zipCode=input.nextInt();

        input.nextLine(); //take out the Enter

        System.out.println("Enter the city name and state seperated by comma and space");
        String cityState=input.nextLine();
        String fulladdress=Bnumber+" "+street+" "+cityState+" "+zipCode;

        System.out.println(fulladdress);

        input.close(); //closes the scanner, and helps to run the process fast.


    }
}
