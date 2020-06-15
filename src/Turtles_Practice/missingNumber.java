package Turtles_Practice;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println( missingNumber(arr));

    }

    public static int missingNumber(int[] arr){
        Arrays.sort(arr);

        for(int i=1; i<arr.length; i++){
            if(i!=arr[i-1]){
                return i;
            }
        }

        return 10;
    }
}
