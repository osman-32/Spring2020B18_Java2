package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        /*
        Arrays.sort(): sorts the array in Ascending order
        Arrays.equal(arr1,arr2): arr1==arr2
        Arrays.toString(): converts single dimensional array to string

        Arrays.deepToString(): converts multidimensional array to string
         */
        int[] arr={9,10,8,65,8,6,5};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] salaries={10000,200000,30,5000,432,123123,2000000};
        int length=salaries.length;
        int lastindex=length-1;
        Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        System.out.println("Minimum salary is $"+salaries[0]);
        System.out.println("Maximum salary is $"+salaries[lastindex]);
    }
}
