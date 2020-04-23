package day22_Arrays_Loops;

import java.util.Arrays;

public class Java_Python {
    public static void main(String[] args) {
        String sentence="I like java and javascript";
        String[] arr= sentence.split(" ");

        System.out.println(Arrays.toString(arr));
        int java=0;
        int python=0;
        String[] arr1=arr;
        /*
        for (int i=0; i<arr.length; i++){
            arr1[i]=arr1[i].toLowerCase();
            if (arr[i].contains("java")){
                java++;
            }
            if(arr1[i].contains("python")){
                python++;
            }
        }
        */

        for (String each:arr){

            if (each.contains("java")){
                java++;
            }
            if(each.contains("python")){
                python++;
            }

        }
        System.out.println("The sentence includes "+java+" java words.");
        System.out.println("The sentence includes "+python+" python words");

    }
}
