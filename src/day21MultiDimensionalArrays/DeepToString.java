package day21MultiDimensionalArrays;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int[] arr1D={1,2,3};
        System.out.println(Arrays.toString(arr1D));
        int[][] arr2D={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr2D));

        int[][][] arr3D={{{3,4,6},{5,3,6,6}},{{3,7,9,2},{1,6,9,5}}};
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[0]));
        System.out.println(Arrays.toString(arr3D[0][1]));

    }
}
