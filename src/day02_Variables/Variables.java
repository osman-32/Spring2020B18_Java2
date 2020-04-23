package day02_Variables;

public class Variables {
    public static void main(String[] args) {
        /*
        Declare variables:
        Data Type VariableName=Data
         */
        byte l=4;
        byte w=2;
        byte area=8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);


        //byte num1=130; exceeds the range of byte.
        //byte num=3.5; for decimal numbers we use only float or double and byte, short, int and long accept only whole numbers
        //short num2=3.5;

        short num3=1000;
        System.out.println(num3);
        //short num4=40000; exeeds the range of short
        System.out.println(12345); //by default the compiler takes it as int.

        int n1=1000;
        int n2=1000000000;
        System.out.println(n2);
        //int n3=9999999999; <-- this number is out of the range of int.
        long n4=99999999999l;
        System.out.println(n4); //forcefully telling the compiler that this data is long number.
        System.out.println(99999999999999L);
        long n5=19;
        System.out.println(n5);
        //int num6=7L; larger one cannot be assigned smaller one.

        //double>float>long>int>short>byte
        short s1=10;
        //byte b1=s1; short is larger than byte
        int i1=s1;
        //byte b2=i1; larger one cannot assigned smaller one.
        System.out.println(3.5);
        double d1=3.5;
        //float f1=4.5; double primitive is larger than float primite, it cannot assigned.
        float f2=5.5f;
        System.out.println("=========================================================");

        float pi=3.14f;
        double p=3.14f;

        int a1=3000;

        double d2=a1;
        System.out.println(d2);
        long l2=40;
        float f3=l2;


    }
}
