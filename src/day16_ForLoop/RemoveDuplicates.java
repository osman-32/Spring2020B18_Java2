package day16_ForLoop;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Word");
        String str=input.next();
        String result="";
        for (int i=0; i<=str.length()-1; i++){

          // if(!result.contains(""+str.charAt(i))){
           //    result+=str.charAt(i);
          // }
            if (result.contains(""+str.charAt(i))){
                continue;
            }
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
