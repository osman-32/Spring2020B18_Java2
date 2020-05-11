package Turtles_Practice;

public class MaximumMinimumNumber {
    /*
    Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {

        int [] arr={3,5,2,-6,2,9,};
        System.out.println(max(arr));
        System.out.println(min(arr));

    }

    public static int max(int[] arr){
        int max=arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr){
        int min=arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
