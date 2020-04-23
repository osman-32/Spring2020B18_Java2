package day05_Unary_ShorthandOperators;

public class LeapYear {
    /*
    Warm Up tasks:
    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true

     */

    public static void main(String[] args) {

        short year=2020; //a year is called a leapyear if it can be divisible by 4 and remaining is 0. it should be "leapyear=%year==0"
                            //if returns true==> leapyear, if it returns false ==> not leapyear
        boolean leapYear=year%4==0;

        //System.out.println(year+" is leap year: "+leapYear);

        String result=year+" is leap year: "+leapYear;

        System.out.println(result);
    }
}
