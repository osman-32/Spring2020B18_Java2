package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1= LocalDate.of(2020,4,24);
        System.out.println(date1);

        LocalDate birthday=LocalDate.of(1985,1,2);
        System.out.println(birthday);

       boolean result1=date1.isAfter(birthday);
        System.out.println(result1);

        boolean result2=date1.isBefore(birthday);
        System.out.println(result2);

        boolean result3=date1.isEqual(birthday);
        System.out.println(result3);

        boolean result4=date1.isLeapYear();
        System.out.println(result4);
        System.out.println("================================");

        LocalDate now=LocalDate.now();
        System.out.println("Today is "+now);

        String str=now.toString();
        System.out.println(str.replace("-"," "));

    }
}
