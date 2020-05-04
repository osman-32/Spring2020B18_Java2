package Turtles_Practice;

import java.util.Arrays;

public class _195MethodsAnagram {
    public static void main(String[] args) {
        String word1="sil ent";
        String word2="listen";
        word1=(word1.replace(" ", "")).toLowerCase();
        word2=(word2.replace(" ","")).toLowerCase();

        char [] arr1=word1.toCharArray();
        char [] arr2=word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr1,arr2));
    }
}
