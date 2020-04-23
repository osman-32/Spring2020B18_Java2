package day05_Unary_ShorthandOperators;

public class Divisibilty {
    /*
    write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
     */
    public static void main(String[] args) {
        int num=87;
        boolean div2 = num%2==0;
        boolean div3 = num%3==0;
        boolean div5 = num%5==0;

        String result1=num+" is divisible by 2: "+div2;
        String result2=num+" is divisible by 3: "+div3;
        String result3=num+" is divisible by 5: "+div5;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println("==========================================================================");

        System.out.println(result1+" "+result2+" "+result3);
        System.out.println("=========================================================================");

        System.out.println(num+" is divisible by 2: "+div2);
        System.out.println(num+" is divisible by 3: "+div3);
        System.out.println(num+" is divisible by 5: "+div5);
        System.out.println("=========================================================================");

        System.out.print(num+" is divisible by 2: "+div2+"\n"+num+" is divisible by 3: "+div3+"\n"+num+" is divisible by 5: "+div5);
    }
}
