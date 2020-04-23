package day20_ArraysContinue;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Sorting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] arr1={10, 19, 5,2,3,5,-1,300};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is "+arr1[0]);
        System.out.println("Second min number is "+arr1[1]);

        System.out.println("First max number is "+arr1[arr1.length-1]);
        System.out.println("Second max number is "+arr1[arr1.length-2]);

        char [] ch={'Z', 'D', 'W', 'Y', 'A', 'B', 'E', 'D'};
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));

        String [] names={"Deniz", "Osman", "Rustem", "Ali", "ANna", "Adil"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("=====================================");


        int[] arr={3,1,4,-1,100,-100,200,155};
        Arrays.sort(arr);

        int[] arrDesc=new int[arr.length];

        System.out.println(Arrays.toString(arr));

        int j=0;

        for (int i=arr.length-1; i>=0; i--){
            //System.out.print(arr[i]+" ");
            arrDesc[j]=arr[i];
            j++;
        }
        System.out.println();
        System.out.println(Arrays.toString(arrDesc));

        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};



    }
}
