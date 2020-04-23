package day13_StringClass;

import java.lang.String; //not necessary, all the class in "java.lang" package are imported automatically

public class StringLiterals {

    public static void main(String[] args) {
        String str1 = "cat";
        String str2 =new String("cat"); //Java Heap

        System.out.println(str1+":"+str2);

        System.out.println(str1==str2); //two different object, false

        String str3="cat"; //String pool

        System.out.println(str1==str3); //True

        String str4=new String("cat");

        System.out.println(str2==str4); //str2 and str4 are indepent objects

        String s1="Java"; //String pool, immutable we cannot modify it
        s1="JavaScript"; //new object will be created in the String Pool

        String s2="Java"; //no new object will be created in the memory

        System.out.println(s1);

        System.out.println(s1==s2); // s1 is JavaScript and s2 is Java===> false

    }
}
