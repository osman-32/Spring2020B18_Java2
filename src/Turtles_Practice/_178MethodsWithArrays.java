package Turtles_Practice;

import java.util.Arrays;

public class _178MethodsWithArrays {
    public static int[] mergR(int[] a,int[] b) {
        int[] arr=new int[a.length+b.length];
        for(int i=0; i<a.length+b.length; i++){
            if(i<a.length){
                arr[i]=a[i];
            } else {
                arr[i]=b[i-a.length];
            }
        }
        return arr;


    }

    public static void main(String[] args) {
        int [] arr1={1,2,3};
        int [] arr2={6,7,8};
        int[] arr3=mergR(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }
}
