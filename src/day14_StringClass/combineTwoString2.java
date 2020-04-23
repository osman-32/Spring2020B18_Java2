package day14_StringClass;

import java.util.Scanner;

public class combineTwoString2 {
    /*
    Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1=input.next();

        System.out.println("Enter the second word");
        String word2=input.next();

        String result1=word1.substring(1,word1.length()).concat(word2.substring(1,word2.length()));

        System.out.println(result1);


    }
}
