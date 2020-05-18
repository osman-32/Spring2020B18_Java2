package Turtles_Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {


        LocalDate date1=LocalDate.of(1998,3,12);
        System.out.println(date1);

        LocalDate birthday=LocalDate.of(1985,1,3);
        System.out.println(birthday);

        System.out.println(date1.isAfter(birthday));

        System.out.println(date1.isBefore(birthday));

        System.out.println(date1.isEqual(birthday));

        System.out.println(birthday.isLeapYear());
        System.out.println("===========================================");

        LocalDate now= LocalDate.now();
        System.out.println(now);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE,yyyy,MMMM");
        System.out.println(date1.format(dtf));



        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("M,E,yy");
        System.out.println(birthday.format(dtf3));

        LocalTime time1= LocalTime.now();
        System.out.println(time1);

        LocalTime time2=LocalTime.of(4,23,23);
        System.out.println(time2);

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("mm:hh");
        LocalTime time3=LocalTime.of(16,54,23);
        System.out.println(time3.format(dtf4));

        LocalDateTime now2=LocalDateTime.now();
        System.out.println(now2);




    }
}
