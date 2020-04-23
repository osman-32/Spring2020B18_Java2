package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        char [][] arr2D={{'A','B'},{'C','D','E'},{'F','J','H'}};

        System.out.println(Arrays.deepToString(arr2D));
        for (int i=0; i<arr2D.length; i++){
            System.out.println(Arrays.toString(arr2D[i]));
        }

        for (char[] array1D:arr2D){
            for(char eachElement:array1D){
                System.out.print(eachElement+" ");
            }
            System.out.println();
        }
    }
}
