package Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int max=-2147483648;

        int i=1;
        while (i<=3) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num>max){
                max=num;
            }

            i++;
        }
        System.out.println("The maximum number is "+max);
    }
}
