package day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String [] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        int attempts=1;

        while (num>7 || num<1){
            System.out.println("Invalid Entry, please re enter the number");
            num=input.nextInt();
            attempts++;
            if (attempts==3 && (num>7 || num<1)){
                System.out.println("Invalid Entry, you have 3 attements");
                System.exit(0);
            }
        }



        String result=days[num-1];
        System.out.println(result);
    }
}
