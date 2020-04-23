package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {
        String str="ey edip adanada pide ye";

        String reversedStr="";//store the reversed version of str
        int index=str.length()-1; // last index number

        while (index>=0){
            reversedStr+=str.charAt(index);
            index--;
        }
        System.out.println(reversedStr);
        if(str.equals(reversedStr)){
            System.out.println("it is a palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }
}
