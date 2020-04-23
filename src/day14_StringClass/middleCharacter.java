package day14_StringClass;

import java.util.Scanner;

public class middleCharacter {
    /*
    Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=input.next();

        String middleCharacter=" ";

        String middlecharacter=" ";

        int totalChars=word.length();
        int middleNumber=totalChars/2;

        if (totalChars%2!=0){
            middlecharacter=middlecharacter+word.charAt(middleNumber);

        }else {
            middlecharacter=word.charAt(middleNumber-1)+""+word.charAt(middleNumber);
        }

        System.out.println(middlecharacter);

        int length=word.length();

        if (length%2==0){
            middleCharacter=word.substring(length/2-1,length/2+1);
        } else{
            middleCharacter=word.substring(length/2,(length)/2+1);
        }

        System.out.println(middleCharacter);



    }


}
