package day22_Arrays_Loops;

import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        /*
          Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement
         */
        int[] numbers= new int[100]; // the length is 100 and index starts from 0, ends 199.
        System.out.println(Arrays.toString(numbers));

        for (int i=0; i<200; i++){
            if(i%2==0){
                numbers[i/2]=i;
                continue;
            }

        }
        System.out.println(Arrays.toString(numbers));

    }
}
