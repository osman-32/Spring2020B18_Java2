package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        char[][] arr2D={{'A','B'},{'C','D','E'},{'F','J','H','I'}};
        for (int i=0; i<arr2D[0].length; i++){
            System.out.println(arr2D[0][i]);
        }
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.deepToString(arr2D));

        for (int i=0; i<arr2D.length; i++){
            for (int j=0; j<arr2D[i].length; j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}
