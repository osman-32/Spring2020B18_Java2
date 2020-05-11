package Turtles_Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class

Ex:  int[] arr = {10,20,7, 8, 90};

                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */
    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(descending(arr));
        System.out.println(ascending(arr));

    }
    public  static ArrayList<Integer> descending(int[] arr){

        ArrayList<Integer> arr1=new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            arr1.add(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr1.get(j)<arr1.get(j+1)){
                    Collections.swap(arr1,j,j+1);
                }
            }
        }

        return arr1;
    }

    public  static ArrayList<Integer> ascending(int[] arr){

        ArrayList<Integer> arr1=new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            arr1.add(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr1.get(j)>arr1.get(j+1)){
                    Collections.swap(arr1,j,j+1);
                }
            }
        }

        return arr1;
    }
}
