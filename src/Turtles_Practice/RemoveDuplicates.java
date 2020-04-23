package Turtles_Practice;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String str=scan.next();
        System.out.println(str);
        String str1= RemoveDuplicates(str);
        System.out.println(str1);
        for (int i=0; i<str1.length(); i++){
            System.out.print(Frequency(str,str1.substring(i,i+1))+" ");
        }
        System.out.println();
        System.out.println(FrequencyOfChars(str));


    }
    public static String RemoveDuplicates(String str){
        String result="";
        for (int i=0; i<str.length(); i++){
            if(result.contains(str.substring(i,i+1))){
                continue;
            }
            result+=str.charAt(i);
        };
        return result;
    }
    public static int Frequency(String str1, String str2){
        int result=0;
        if(str2.length()>str1.length()){
            result=0;
        }else{
            for(int i=0; i<str1.length()-str2.length()+1; i++){
                if(str1.substring(i,i+str2.length()).contains(str2)){
                    result++;
                }
            }
        }
       return result;
    }
    public static String FrequencyOfChars(String str){
        String str1=RemoveDuplicates(str);
        int lengthstr1=str1.length();
        int[] arr=new int[lengthstr1];
        String result="";
        for (int i=0; i<str1.length(); i++){
            arr[i]=Frequency(str,str1.substring(i,i+1));
            result+=str1.substring(i,i+1)+arr[i];
        }
        return result;
    }

}
