package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoops3 {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3},{4,5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19,20,21}};
        int count=0;
        for (int i=0; i< numbers.length; i++){
            for (int k=0; k<numbers[i].length; k++){
                if(numbers[i][k]%2==0){
                    System.out.print(numbers[i][k]+" ");
                    continue;
                }
                count++;
            }
        }
        System.out.println();
        System.out.println("number of odd numbers: "+count);

        int count1=0;
        int sumOfOdd=0;
        int sumOfEven=0;
        for (int[] each1Darray:numbers){

            for (int eachElement:each1Darray){
                if (eachElement%2==0) {
                    System.out.print(eachElement + " ");
                    sumOfEven+=eachElement;
                    continue;
                }
                count1++;
                sumOfOdd+=eachElement;
            }

        }
        System.out.println();
        System.out.println(count1);
        System.out.println("Sum of even numbers is "+sumOfEven);
        System.out.println("Sum of even numbers is "+sumOfOdd);

    }
}
