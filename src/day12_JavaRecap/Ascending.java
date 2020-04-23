package day12_JavaRecap;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        String result=" ";
                if (num1<=num2 && num1<=num3){
                    if(num2<=num3){
                        result=num1+","+num2+","+num3;
                    }else {
                        result=num1+","+num3+","+num2;
                    }
                }else if(num2<=num1 && num2<=num3){
                    if(num1<=num3){
                        result=num2+","+num1+","+num3;
                    }else{
                        result=num2+","+num3+","+num1;
                    }
                }else {
                    if (num1 <= num2) {
                        result = num3 + "," + num1 + "," + num2;
                    } else {
                        result = num3 + "," + num2 + "," + num1;
                    }
                }
                    System.out.println(result);
    }
}
