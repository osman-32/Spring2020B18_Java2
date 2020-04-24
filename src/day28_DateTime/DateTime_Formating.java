package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formating {
    public static void main(String[] args) {
        LocalDateTime datetime1=LocalDateTime.of(2015,12,25,23,30,45);
        System.out.println(datetime1);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        System.out.println(datetime1.format(dtf));
    }
}
