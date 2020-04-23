package day22_Arrays_Loops;

import java.util.Arrays;

public class reverseArray {
    /*
    warmup tasks:
    1. write a program that can reverse the array
    2. write a program that sort the array in descending order
    3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
     */
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] RevArr=new int[arr.length]; // [0,0,0,0,0]
        for (int i=0; i<arr.length; i++){
            RevArr[i]=arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(RevArr));
    }
}
