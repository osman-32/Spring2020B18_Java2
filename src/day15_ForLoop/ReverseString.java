package day15_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the word.");
        String word=input.nextLine();
        String reverse=" ";

        for (int num=word.length()-1; num>=0; num--){
          reverse+=word.charAt(num);

        }
        System.out.println(reverse);

    }
}
