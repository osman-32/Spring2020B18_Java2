package Turtles_Practice;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean good=false;

        do{
            System.out.println("Enter a user name");
            String userName=input.next();

            try {
                checkforDigits(userName);
                good=true;
            } catch (MustHaveNumberException e) {
                System.out.println(e+"\n");
            }

        }while (good==false);

    }

    public static void checkforDigits(String userName) throws MustHaveNumberException{
        int digit=0;

        for(int i=0; i<userName.length(); i++){
            if(Character.isDigit(userName.charAt(i))){
                digit++;
            }
        }

        if(digit==0){
            throw new MustHaveNumberException(userName);
        }
    }
}
