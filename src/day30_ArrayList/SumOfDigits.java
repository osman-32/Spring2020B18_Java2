package day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {
    /*
     write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
     */
    public static void main(String[] args) {
        String str="a1b2c3d4";
        char[] chars= str.toCharArray();

        System.out.println(Arrays.toString(chars));

        int sum=0;

        for (char each:chars){

            if (each>=48 && each<=57){// if each is digit, we will convert to int and add it to sum
                sum+=Integer.parseInt(""+each);
            }
            if(Character.isAlphabetic(each)){
                continue;
            }

        }
        System.out.println(sum);
        boolean a=Character.isAlphabetic('A'); //identifies if the character is alphabet

        /*
        assignment task:
            extract the digits and letters for a string
         */
    }
}
