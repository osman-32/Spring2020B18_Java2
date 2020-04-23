package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
        /*
        salary, stateTax, federalTax, loan, ssn

         */
        int salary=1200000;
        double federalTax=0.18;
        float stateTax=0.065f;
        //salary after tax=salary(1-sum of taxes)
        double sumTaxes=federalTax+stateTax;
        double salaryAfterTax=salary*(1-sumTaxes);
        System.out.println(salaryAfterTax);
        System.out.println("==================================================");
        //area of circe is r*r*pi
        double r=5.5;
        double pi=3.14;
        double area=r*r*3.14;
        System.out.println(area);
        System.out.println("====================================================");
        int kg=90;
        double pound=2.25*kg;
        System.out.println(pound);
        System.out.println("====================================================");
        double lira=1000;
        double liraInDolar=lira*6.16;
        System.out.println(liraInDolar);
        System.out.println("====================================================");
        double litre=10000;
        double gallons=litre/3.78;
        System.out.println(gallons);


    }
}
