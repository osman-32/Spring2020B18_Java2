package day16_ForLoop;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        int sum=0;

        for (int i=1; i<=num; i++){
            sum+=i;
        }
        System.out.println("The sum of nubmers between 1 to "+num+" is "+sum);



    }
}
