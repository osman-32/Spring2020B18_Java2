package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "AABBCC"; //A2B2C2

        String NonDup = Library.RemoveDuplicates(str);
        String result="";

        for (int i=0; i<NonDup.length(); i++){
            String ch=""+NonDup.charAt(i);
            int num= Library.Frequency(str,ch);

           // System.out.print(ch+num);
            result+=ch+num;
        }
        System.out.println(result);

    }
    public static String FrequencyOfChars(String str){
        String NonDup = Library.RemoveDuplicates(str);
        String result="";

        for (int i=0; i<NonDup.length(); i++){
            String ch=""+NonDup.charAt(i);
            int num= Library.Frequency(str,ch);

            // System.out.print(ch+num);
            result+=ch+num;
        }
       return result;
    }
}
