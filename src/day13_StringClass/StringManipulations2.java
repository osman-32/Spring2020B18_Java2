package day13_StringClass;

import day12_JavaRecap.SalaryReport;

public class StringManipulations2 {
    public static void main(String[] args) {
        String str="Cybertek School is the best";
                  //0123456789
        String schoolName=str.substring(0,8);
        System.out.println(schoolName);
        String A=str.substring(9,16);
        System.out.println(A);

        String fullName="Kuzzat Altay";
        //               0123456789
        String firstName=fullName.substring(0,6);
        System.out.println(firstName);
        String lastName=fullName.substring(7,12);
        System.out.println(lastName);

        //full name=firstname lastname
        //gmail:lastname_firstname@mgmail.com

        String Murtaza="Murtaza Nazeeri";
        //              012345678...

        String firstname=Murtaza.substring(0,7);
        String lastname=Murtaza.substring(8,15);
        System.out.println(lastname);
        System.out.println(firstname);

        //String gmail=lastname.concat("_").concat(firstname).concat("@gmail.com");
        //String gmail=lastname+"_"+firstname+"@gmail.com";
        String gmail=Murtaza.substring(8,14+1)+"_"+Murtaza.substring(0,6+1)+"@gmail.com";

        System.out.println(gmail);

        String s1="I love Java Programming Language";
        //         0123456789...

        String classname=s1.substring(7);
        System.out.println(classname);

        String s2="I like C# Programming C# C#";
        s2=s2.replace("C#","Java");
        System.out.println(s2);

        String name="COVID 18";
        name=name.replace("8", "9");
        System.out.println(name);

        String r1="I like C#, C# is fun, C# is cool";
        r1=r1.replaceFirst("C#", "Java");
        System.out.println(r1);

        String r2="Tomorrow is Monday, Tomorrow is Tuesday";
        r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);
    }
}
