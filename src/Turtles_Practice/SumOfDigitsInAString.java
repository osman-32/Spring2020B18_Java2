package Turtles_Practice;

public class SumOfDigitsInAString {
    /*
    Write a method that can return the sum of the digits in a string
     */
    public static void main(String[] args) {
        String str="23dsdf45e56yefgsdfs";
        sumOfString(str);

    }
    public static void sumOfString(String str){
        char[] ch=str.toCharArray();
        int sum=0;
        int a='5';
        System.out.println(a);
        for (int i=0; i<ch.length; i++) {
            if (Character.isDigit(ch[i])){
                sum+=Integer.parseInt("" + ch[i]); //ch[i]-'0'
                System.out.println(ch[i]);
            }
        }
        System.out.println("Sum of digits of "+str+" is "+sum);
    }
}
