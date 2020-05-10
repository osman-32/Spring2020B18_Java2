package Turtles_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        Random num2 = new Random();
        int num1=num2.nextInt(50000);
        System.out.println(num1);
        if(num1<=0){
            System.out.println(num1+ " is not a prime number");
            System.exit(0);
        }
        for(int j=num1; j>=2; j--) {
            int count=0;
            int a=j;
            for (int i = 2; i < a; i++) {
                if (a % i != 0) {
                    count++;
                }
            }
            if (count==a-2){
                arr.add(a);

            }
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
