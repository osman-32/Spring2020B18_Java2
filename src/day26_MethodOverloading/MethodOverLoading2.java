package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverLoading2 {
    /*
    first method: print the sum of two int numbers
    second method: print the sum of three int numbers
    third method: rint the sum of four int numbers
     */
    public static void main(String[] args) {
        sum2Numbers(2,5);
        sum3Numbers(3,5,7);
        sum4Numbers(3,5,7,4);

        sum(3,5,6,3);

        int[] arr1={3,2,1};
        char[] arr2={'a','b','c'};
        double[] arr3={7.4,6.5,20.6};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

    }

    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }
    public static void sum3Numbers(int a,int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum4Numbers(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
    //==================================================================================================
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}
