package day03_VariablesContinue;

public class SalaryCalculator {
    /*
    Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
     */
    public static void main(String[] args) {
        double hourlyRate=65;
        double stateTaxRate=0.04;
        double federalTaxRate=0.22;
        byte weeklyHours=45;
        byte totalWeeks=48;

        //salary=hourlyRate*weeklyHours*52
        double yourSalary=hourlyRate*weeklyHours*totalWeeks;

        //stateTax=salary*stateTaxRate
        double stateTax=yourSalary*stateTaxRate;

        //federalTax=salary*federalTaxRate
        double federalTax=yourSalary*federalTaxRate;

        //total of taxes=stateTax+federalTax
        double yourTotalTax=stateTax+federalTax;

        //your income=yoursalary-yourTotalTax
        double yourIncomeAfterTax=yourSalary-yourTotalTax;
        //salary before tax=Gross income


        System.out.println("\nYour salary is: $"+yourSalary);
        System.out.println("State Tax is: $"+stateTax);
        System.out.println("Federal Tax is: $"+federalTax);
        System.out.println("Your total tax is: $"+yourTotalTax);
        System.out.println("Your income after tax is: $"+yourIncomeAfterTax);
    }
}
