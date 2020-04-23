package day13_StringClass;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        String str="Cybertek";
        //          01234567--->index number
        char ch1=str.charAt(5);
        System.out.println(ch1);
        System.out.println(ch1=='A');
                        //'t'=='A'

       int totalLength= str.length();
        System.out.println(totalLength);

        System.out.println(totalLength>10);

        String str2="Today is great day, Java is Fun";
        int maxIndexnum=str2.length()-1;
        System.out.println(maxIndexnum);

        String s1="Cybertek";
        s1=s1.concat(" School"); //"Cybertek School"

        System.out.println(s1); // Cybertek School

        String s2="Java";
        System.out.println(s2.concat(" is a programming language")); //"Java is a programming language "
        System.out.println(s2);

        s2=s2.concat(" is a programming language");
        System.out.println(s2);

        String r1="Java is fun";
        r1=r1.concat(", and it's easy");

        System.out.println(r1);

        String name1="CYBERTEK";
        System.out.println(name1);//CYBERTEK
        name1=name1.toLowerCase();
        System.out.println(name1);//cybertek

        name1=name1.toUpperCase();
        System.out.println(name1); //CYBERTEK

        String name2="cybertek school";
        System.out.println(name2); //cybertek school
        name2=name2.toUpperCase();
        System.out.println(name2); //CYBERTEK SCHOOL

        String A1="           Today is a       great day     ";
        System.out.println(A1);
        A1=A1.trim();
        System.out.println(A1);





    }
}
