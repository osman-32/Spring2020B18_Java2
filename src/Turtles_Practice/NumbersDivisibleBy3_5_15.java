package Turtles_Practice;

public class NumbersDivisibleBy3_5_15 {
    /*
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
     */
    public static void main(String[] args) {

        String divisible15 = "";
        String divisible5 = "";
        String divisible3 = "";
        for (int i=1; i<=100; i++){
            if (i%3==0 && i%5==0 ){
                divisible15+=" "+i;
            } else if(i%3==0){
                divisible3+=" "+i;
            }else if(i%5==0){
                divisible5+=" "+i;
            }
        }
        System.out.println("Divisible by 3: "+divisible3);
        System.out.println("Divisible by 5: "+divisible5);
        System.out.println("Divisible by 15: "+divisible15);
    }
}
