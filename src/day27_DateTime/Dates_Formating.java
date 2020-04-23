package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates_Formating {
    public static void main(String[] args) {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));

        




    }
}
