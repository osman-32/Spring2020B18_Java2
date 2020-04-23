package day18_NestedLoop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = input.nextLong();
        long f = 1;
        int i = 1;


        for (i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(n + "!=" + f);

        /*
        int i=1;
        while (i<=n){
            f*=i;
            i++;
        }
        System.out.println(n+"!="+f);

         */
    }
}
