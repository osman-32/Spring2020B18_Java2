package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {
        int number=0;

        if(number>=0){
            System.out.println(number+ " is positive");
        }
        if(number<0){
            System.out.println(number+" is negative");
        }
        System.out.println("==========================================================");
        if(number >= 0){
            System.out.println(number+" is positive");
        } else{
            System.out.println(number+" is negative");
        }
        System.out.println("==========================================================");

        int number1=55;

        boolean evenNum=number1%2==0;

        if(evenNum){
            System.out.println(number1+" is an even number");
        } else{
            System.out.println(number1+" is an odd number");
        }
        System.out.println("==========================================================");

        short age=15;
        boolean eligible=age>=21;
        if(eligible){
            System.out.println("You are eligible to buy alcohol.");
        } else{
            System.out.println("Your are not eligible to buy alcohol");
        }
        System.out.println("==========================================================");

        boolean testedPositiveForCorona=false;
        if(testedPositiveForCorona){
            System.out.println("You are COVID-19 flu.");
        } else{
            System.out.println("You are not COVID-19 flu.");
        }
    }
}
