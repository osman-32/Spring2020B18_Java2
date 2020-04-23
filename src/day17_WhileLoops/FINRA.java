package day17_WhileLoops;
import java.util.Scanner;
public class FINRA {
    /*
    3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA
     */
    public static void main(String[] args) {
        String result="";
        for (int i=1; i<31; i++){
            if (i%3==0 && i%5==0){
               result+="FINRA"+" ";
            }else if (i%3==0){
                result+="FIN"+" ";
            }else if (i%5==0){
                result+="RA"+" ";
            }else {
                result+=i+" ";
            }

        }
        System.out.println(result);

    }
}
