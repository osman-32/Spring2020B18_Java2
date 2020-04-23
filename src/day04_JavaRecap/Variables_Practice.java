package day04_JavaRecap;

public class Variables_Practice {
    public static void main(String[] args) {
        //DataType variableName=Data;

        byte num1=127;
        short num2=num1; // double>float>long>int>short>byte

        //byte num3=num2;

        int num4=num2; //int is prefered by compiler

        long num5=999999999999L;

        float num6=100L;
        System.out.println(num6); //100.0

        float num7=0.5f;
        System.out.println(num7);

        double num8=0.5f;
        double num9=9999999999L;
        double num10=100.5;
        System.out.println(num10);

        char ch1='$'; //every single character has a corresponding number
        System.out.println(ch1);

        char ch2=2500;
        System.out.println(ch2);

        int a1='8';
        System.out.println(a1);

        int a2='z';
        System.out.println(a2); //122

        char chx=122;
        System.out.println(chx); //z

        double d1='z'+'8'; // z->122, '8'->56 => 'z'+'8'=122+56=178.0, the decimal comes because of double
        System.out.println(d1);

        char ch3=178;
        System.out.println(ch3);

        char ch4='z'+'8';
        System.out.println(ch4); //²



        boolean bool1=true;
        boolean bool2=false;

        System.out.println(9>10); //false
        System.out.println(9>=9); //true
        System.out.println(9!=10); //true
        System.out.println('a'=='b'-1);//true because 'a'=='b'-1-->97=98-1
        //System.out.println('a'=="a"); the data must be matching, so double quote (") does not mathc single quote (').

        System.out.println("Muhtar"=="Good Guy"); //false
        System.out.println("Muhtar"!="Good Guy"); //true
        System.out.println("Muhtar"=="muhtar"); //false, becasue java is case sensitive
        //System.out.println("Cybertek"==1000); data are not matching

        boolean r1=!true; //false
        System.out.println(r1); //false
        System.out.println(!r1); //true

        System.out.println(!r1==false); //false






    }
}
