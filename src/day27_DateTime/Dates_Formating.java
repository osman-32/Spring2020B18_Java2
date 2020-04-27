package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates_Formating {
    public static void main(String[] args) {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        create a date called birthDay: month/Days/year
                eX: 2020 04  23
                    Apr/23/20
         */

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEEE MMMM/dd/yy");
        LocalDate date2=LocalDate.of(1999,12,30);
        String str1= date2.format(dtf2);
        System.out.println(str1);

        LocalDate date3=LocalDate.now();
        System.out.println(date3.format(dtf2));




    }
}
