package day24_Methods;

import java.util.Arrays;

public class Array_Descending {
    public static void main(String[] args) {
        int[] arr1={1,10,19,8,14,15};

        int[] arr2={200,200,150,500,400};

        int[] arr3={1000,800,5000,3000};

       arr1=sortDesending(arr1);
       arr2=sortDesending(arr2);
       arr3=sortDesending(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);

        int[] RevArr=new int[arr.length];
        int j=arr.length-1;
        for(int i=0; i<arr.length; i++){
            RevArr[i]=arr[j];
            j--;
        }

        return RevArr;

    }
}
