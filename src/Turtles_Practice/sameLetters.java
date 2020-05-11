package Turtles_Practice;

import java.util.Arrays;

public class sameLetters {
    public static void main(String[] args) {
        String str1="silentr";
        String str2="listen";
        System.out.println(sameLetters(str1,str2));


    }
    public static boolean sameLetters(String str1, String str2){
        char[] arr1=str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
}
