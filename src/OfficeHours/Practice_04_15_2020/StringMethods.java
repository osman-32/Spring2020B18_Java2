package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        /*
        String Methods:
        toCharArray(): returns char array
        split(): splits the string by given str, returns string array
         */
        String str="Cybertek";
        char[] ch=str.toCharArray(); //{'C','y','b','e','r','t','e','k'}
        System.out.println(Arrays.toString(ch));

        char[] ch3={'C','y','b','e','r','t','e','k'};
        System.out.println(Arrays.toString(ch3));

        String str1="ABC";
        String str2="BAC";

        char[] ch1=str1.toCharArray(); //{'A','B','C'}
        char[] ch2=str2.toCharArray(); //{'B','A','C'}

        System.out.println(Arrays.equals(ch1,ch2));

        Arrays.sort(ch1); //{'A','B','C'}
        Arrays.sort(ch2); //{'A','B','C'}

        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("=================================");

        String sentence="I like to learn java"; // [I, like, to, learn, java]
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int totalWords=words.length;
        System.out.println("The total number of words is "+totalWords);

        String[] revWords= new String[words.length];

        String result=" ";

        for (int i=words.length-1; i>=0; i--){
            result+=words[i]+" ";
            //System.out.print(words[i]+" ");
            //revWords[words.length-i-1]=words[i];
        }
        System.out.println(result.trim());
        //System.out.println(Arrays.toString(revWords));

    }
}
