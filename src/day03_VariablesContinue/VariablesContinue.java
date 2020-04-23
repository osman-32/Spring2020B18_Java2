package day03_VariablesContinue;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import javax.crypto.spec.PSource;

public class VariablesContinue {
    public static void main(String[] args) {
        boolean result1=true;
        boolean result2=false;

        boolean result3=10>9; //true

        System.out.println(result3);

        System.out.println(true==false);

        System.out.println("Osman"=="Good Guy"); //false

        System.out.println("Osman"!="Good Guy"); //true

        boolean r1=true!=true; //false
        System.out.println(r1);

        boolean r2= "Batch 17"=="Batch 18"; //false
        System.out.println(r2);

        System.out.println("=====================================================");

        char ch1='A';
        System.out.println(ch1);

        char ch2=45000;
        System.out.println(ch2);

        char ch3=25000;
        System.out.println(ch3);

        char ch4=64032;
        System.out.println(ch4);

        char ch5=100;
        System.out.println(ch5);

        char ch6='D'; //D
        System.out.println(ch6);

        int num1='D'; // number 68
        System.out.println(num1);

        char a1='z';
        System.out.println(a1);

        //byte b1=a1; char is larger than byte.
        byte b1='z';
        System.out.println(b1); //122

        //short s1=a1; char is larger than short







    }
}
