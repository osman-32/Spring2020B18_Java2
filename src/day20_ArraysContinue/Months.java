package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        /*
        String months2=new String[12];
                months2[0]="Jan";
                ...
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        int attepmts=1;
        while (num>12 || num<=0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num=input.nextInt();
            attepmts++;
            if (attepmts==3 && (num>12 || num<=0) ){
                System.out.println("Invalid entry, you already have 3 attemts");
                System.exit(0);
            }

        }
        String result=months[num-1];

        System.out.println(result);
    }
}
