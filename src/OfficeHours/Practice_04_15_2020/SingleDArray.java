package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {
        int a=100;
        int[] arr={100,200,300};

        System.out.println(arr[1]);


        for(int i=0; i<3; i++) {
            // System.out.println(i);
            int num = arr[i];
            System.out.println(num);
        }
            int j=0;
            while (j<3){
                int num1=arr[j];
                System.out.println(num1);
                j++;
            }

        System.out.println("===================================");
            String[] names={"John", "Aaron", "Luoise"};
            int length=names.length;
            String [] namesRev= new String[length];

            for (int i=length-1; i>=0; i--){
                namesRev[length-1-i]=names[i];
            }
        System.out.println(Arrays.toString(namesRev));



    }
}
