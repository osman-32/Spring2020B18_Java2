package Turtles_Practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String [] args) {
        String word1="ice man";
        String word2="cinema";
        System.out.println(word1.length() != word2.length());


        word1 =word1.toLowerCase();
        word2=word2.toLowerCase();
        char[] ch1 =word1.toCharArray();
        char[] ch2 =word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        if (Arrays.equals(ch1,ch2)){
            System.out.println( true);
        }else {
            System.out.println(false);
        }
    }
}
