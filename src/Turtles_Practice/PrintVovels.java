package Turtles_Practice;

import java.util.Scanner;

public class PrintVovels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String result="";
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)=='a'
                    || word.charAt(i)=='e'
                    || word.charAt(i)=='i'
                    || word.charAt(i)=='o'
                    || word.charAt(i)=='u'){
                result+=""+ word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
