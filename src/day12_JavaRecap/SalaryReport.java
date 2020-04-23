package day12_JavaRecap;

import java.util.Scanner;

public class SalaryReport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary=input.nextDouble();
        input.nextLine();
        System.out.println("Enter your full name");
        String fullName=input.nextLine();

        System.out.println("Enter company name:");
        String companyName=input.nextLine();
        System.out.println("Enter SSN:");
        int SSN=input.nextInt();
        input.nextLine();
        System.out.println("Enter job title");
        String jobTitle=input.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job Title is: "+jobTitle);
        System.out.println("Company Name is: "+companyName);
        System.out.println("SSN is: "+SSN);
        System.out.println("Salary is: $"+salary);




    }

}
