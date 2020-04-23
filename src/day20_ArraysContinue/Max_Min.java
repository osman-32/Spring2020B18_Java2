package day20_ArraysContinue;

public class Max_Min {
    public static void main(String[] args) {
        /*
         1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
         */
        int[] arr={2,3,4,5,6,7,8,9};
        int lastindex=arr.length-1;
        int max=arr[0];
        int min=arr[0];


        for (int i=0; i<=lastindex; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
