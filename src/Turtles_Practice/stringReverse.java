package Turtles_Practice;

public class stringReverse {
    /*
    Write a return method that can reverse  String
     */
    public static void main(String[] args) {
        String str= "GonulPerwerBerfinBedirxan";
        System.out.println(Reversed(str));


    }

    public static String Reversed(String str){
        String str1="";

        for (int i=str.length()-1; i>=0; i--){
            str1+=""+str.charAt(i);
        }
        return str1;
    }
}
