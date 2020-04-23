package day12_JavaRecap;

import java.util.Scanner;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        char ch1='K';

        String result=(ch1=='A') ? "Ais selected"
                :(ch1=='B')?"B is selected"
                :(ch1=='C')?"C is selected"
                :(ch1=='D')?"D is selected"
                :(ch1=='E')?"E is selected"
                :"Invalid Entery";
        System.out.println(result);
    }
}
