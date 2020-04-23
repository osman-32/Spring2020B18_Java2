package day10_Switch_Scanner;

public class days {
    // write a program that can display the days based on the numbers 1 ~ 7
    public static void main(String[] args) {
        byte day=5;
        String result="";
        if(day>=1 && day<=7){
            if(day==1){
                result="Monday";
            }else if(day==2){
                result="Tuesday";
            }else if(day==3){
                result="Wednesday";
            }else if(day==4){
                result="Thursday";
            }else if(day==5){
                result="Friday";
            }else if(day==6){
                result="Saturday";
            }else if(day==7){
                result="Sunday";
            }
        }else{
            result="invalid";
        }
        String result2=" ";


            if(day>=1 && day<=7) {
                result2 = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" : (day == 4) ? "Thursday" : (day == 5) ? "Friday"
                        : (day == 6) ? "Saturday" :"Sunday";
            }else{
                result2="invalid";
            }

        System.out.println(result);
        System.out.println(result2);
    }
}
