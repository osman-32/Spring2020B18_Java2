package day11_Switch_Scanner_Practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = input.nextDouble();
        System.out.println("Enter State Tax Rate:");
        double stateTaxRate=input.nextDouble();
        System.out.println("Enter Federal Tax Rate:");
        double federalTaxRate=input.nextDouble();
        double totalTax=salary*(stateTaxRate+federalTaxRate);
        double salaryAfterTax=salary-totalTax;

        System.out.println("Your salary after tax is: "+salaryAfterTax);
        System.out.println("Your total tax is: "+totalTax);



    }
}
