package day22_Arrays_Loops;

import java.util.Arrays;

public class nested_ForEach {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int each:arr){
            System.out.print(each+" ");
        }
        System.out.println();

        int[][] arr2D={{1,2,3},{4,5,6}};
        System.out.println();
        for (int[] each1Darray:arr2D){
          //  System.out.println(Arrays.toString(each1Darray));
            for (int eachElement:each1Darray){
                System.out.print(eachElement+" ");
            }
        }
        System.out.println();
        System.out.println("==================================");
        char[][] ch2D={{'A','B'},{'C','D','E'}};
        for (char[] each1Darray:ch2D){
            for (char eachElement:each1Darray){
                System.out.print(eachElement+" ");
            }
        }

    }
}
