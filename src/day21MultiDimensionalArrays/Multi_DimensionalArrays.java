package day21MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[][]arr2D={{1,2,3},{4,5,6,7}};
                    //  0        1


        System.out.println(arr2D.length);

        int[] arr1D=arr2D[0]; //{1,2,3}
        System.out.println(Arrays.toString(arr2D[1]));

        int num1=arr2D[1][3];
        System.out.println(num1);

        char[][] ch2D={{'A','B'},{'D','E','F'},{'G','H','I'}};
        char ch=ch2D[1][2];
        System.out.println(ch);

        char c1=ch2D[1][0];
        System.out.println(c1);

        char[] ch2=ch2D[2];
        System.out.println(Arrays.toString(ch2));

        String[][] str2D={{"A","B","C"},{"D","E","F"},{"J","H","I"}};

        String r1=str2D[2][1];




    }
}
