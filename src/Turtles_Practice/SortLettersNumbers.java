package Turtles_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SortLettersNumbers {
    /*
    Given alphanumeric String, we need to split the string into substrings of consecutive
    letters or numbers, sort the individual string and append them back together
     */
    public static void main(String[] args) {
        String str="fg3436043fjdlhl4075749gjdl5uy29tjf";
        System.out.println(sorting(str));

    }

    public static String sorting(String str){
        String str2 = "";

        for(int i = 0; i < str.length(); i++) {

            str2 += ""+str.charAt(i);

            if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {

                if(Character.isDigit(str.charAt(i+1)) ) {

                    str2 +=",";

                }

            }



            if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {

                if(Character.isAlphabetic(str.charAt(i+1))) {

                    str2 +=",";

                }

            }

        }

        String[] arr = str2.split(",");  //   [DC 501 GCCCA 098911]
                                              //  -->    CD015

        str ="";

        for(String each: arr) {

            char[] chars=each.toCharArray();

            Arrays.sort(chars);

            for(char eachChar: chars){

                str +=""+eachChar;

            }

        }
//concatination
        return str;

    }
}
