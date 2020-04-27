package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str="123";

        Integer a=Integer.valueOf(str); //Integer,  123

        System.out.println(a);
        double b=Integer.valueOf(str);
            // double=Integer==>unboxing
        System.out.println(b);

        String str2="15.5";
        double d1=Double.parseDouble(str2);
           //double=double==>none
        double d2=Double.valueOf(str2);
            // double=Double==>unboxing

        System.out.println(d1);
        System.out.println(d1);
        System.out.println(d1==d2);

        System.out.println("===========================================================");
        int z1=2000;
        //Long L1=z1; does not accept any other primitives except for long

        Short sh1=3000;
        int z2=sh1; //unboxing

        System.out.println("=========================================================");
        int maxInt=Integer.MAX_VALUE;
        System.out.println(maxInt);

        double maxDouble=Double.MAX_VALUE;
        System.out.println(maxDouble);

        int minInt=Integer.MIN_VALUE;
        System.out.println(minInt);

        byte maxByte=Byte.MAX_VALUE;
        System.out.println(maxByte);

        byte minByte=Byte.MIN_VALUE;
        System.out.println(minByte);

        System.out.println("=======================================================");
        boolean [] arr=new boolean[3];
        System.out.println(Arrays.toString(arr));

        Boolean[] arr2=new Boolean[3];
        System.out.println(Arrays.toString(arr2));

        Integer[] arr3=new Integer[3];
        System.out.println(Arrays.toString(arr3));

        char[] arr4=new char[3];
        System.out.println(Arrays.toString(arr4));
    }
}
