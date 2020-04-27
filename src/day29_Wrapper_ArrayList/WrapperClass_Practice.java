package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class WrapperClass_Practice {
    /*
    Given:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find thhe maximum and minimum numbers
		NOTE: Do not use sort method
     */
    public static void main(String[] args) {
        double[] arr = {1,2.5, 3, 3.5, 4.5};

        double max=Double.MIN_VALUE;
        for (double each:arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);

        String[] arr1 = {"1","2.5", "3", "3.5", "6.5"};

        double max1=Double.MIN_VALUE;
        for (String num1:arr1){
            double num=Double.parseDouble(num1);
            if (num>max1){
                max1=num;
            }
        }
        System.out.println(max1);
        System.out.println("===============================================================");
        String[] arr2 = {"1","2.5", "3", "3.5", "4.5"};
        double[] numbers=new double[arr2.length];
        for (int i=0; i<arr.length; i++){
            numbers[i]=Double.parseDouble(arr2[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
