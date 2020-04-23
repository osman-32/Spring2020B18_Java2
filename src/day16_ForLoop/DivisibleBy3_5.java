package day16_ForLoop;

public class DivisibleBy3_5 {
    public static void main(String[] args) {
        String result="";
        for (int i=1; i<=99; i++) {
            if (i % 2 != 0){ //1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
                if (i % 3 == 0 && i % 5 == 0) {
                    result += i + ", ";
                }
        }
        }
        System.out.println(result);
    }
}
