package day10_Switch_Scanner;

public class daysInMonth {
    /*
    write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF
     */
    public static void main(String[] args) {


        int num = 16;
        String result = (num == 2) ? "Has 28 days."
                : (num == 4 || num == 6 || num == 9 || num == 1) ? "Has 30 days"
                : (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) ? "Has 31 days" : "Invalid";
        System.out.println(result);

    }
}