package day21MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String sentence = "Today is great day";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            String eachWords = words[i];
            //System.out.println(eachWords+" ");
            result += eachWords + " ";
        }
        System.out.println(result);

        String str2 = "ABCD";
        String arr2[] = str2.split(" "); //["A", "B", "C", "D"]
        char[] ch2 = str2.toCharArray(); //

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));


    }
}
