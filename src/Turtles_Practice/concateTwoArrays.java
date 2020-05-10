package Turtles_Practice;

import java.util.Arrays;

public class concateTwoArrays {
    /*
    Write a return method that can concate two arrays
     */
    public static void main(String[] args) {
        String[] arr1={"ali","hespe","binhere"};
        String [] arr2={"Aisha", "shir", "bixwe"};

       String[] arr3= concate(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }

    public static String[] concate(String[] arr1, String[] arr2){
        String [] result= new String[arr1.length+arr2.length];
        for (int i=0; i<arr1.length; i++){
            result[i]=arr1[i];
        }
        for (int i=arr1.length; i<arr2.length+arr1.length; i++){
            result[i]=arr2[i-arr1.length];
        }

        return result;

    }
}
