package day13_StringClass;

import java.util.Scanner;

public class ShippingInfo {
    /*
    write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter building number");
        String buildingNumber=input.next();
        input.nextLine();
        System.out.println("Enter street address");
        String streetAdress=input.nextLine();

        System.out.println("Enter city name");
        String city=input.next();

        input.nextLine();
        System.out.println("Enter state name");
        String state=input.nextLine();

        System.out.println("Enter zip code");
        int zipCode=input.nextInt();

        input.nextLine();
        System.out.println("Enter full name of the person");
        String fullName=input.nextLine();

        System.out.println("Ship To:"+fullName+"\n\t\t"+buildingNumber+" "+streetAdress+"\n\t\t"+city+" "+state+" "+zipCode);



    }
}
