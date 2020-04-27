package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str="123";

      int a1 = Integer.parseInt(str); //123
        System.out.println(str+1); //text
        System.out.println(a1+1);  //number

        byte b1 = Byte.parseByte(str); //this is neither unboxing nor Autoboxing
        System.out.println(b1+3);

        Integer I1 =(int) Byte.parseByte(str); //Autoboxing

        String str2="10.5";
        float f1=Float.parseFloat(str2); // float 10.5
        System.out.println(f1);

        double d1=Double.parseDouble(str2); //double 10.5

        String str3="3147483647";
        double num1=Long.parseLong(str3);
        System.out.println(num1);

        Long num2=Long.parseLong(str3);  //autoboxing
        System.out.println(num2);

        String result1="TruE"; //not "true" or "false" ==> false

        boolean r1=Boolean.parseBoolean(result1);
        System.out.println(r1);

        String result2="fALsE"; //"false"
        boolean r2=Boolean.parseBoolean(result2);
        System.out.println(r2);

    }
}
