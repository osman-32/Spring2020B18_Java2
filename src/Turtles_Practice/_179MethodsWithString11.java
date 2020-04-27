package Turtles_Practice;

public class _179MethodsWithString11 {
    public static String reverse(String input)
    {
        String str="";
        for(int i=input.length()-1; i>=0; i--){
            str+=input.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        String str="osman";
        System.out.println( reverse(str));
    }
}
