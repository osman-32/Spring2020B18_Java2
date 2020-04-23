package day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a=10/3;//3

        double a1=10.0/3;
        System.out.println(a1); //3.3333333333333335

        System.out.println(10/4); //2 because compiler considers this as a int.

        double d=10/4; //the numbers should be written by decimals i.e. 10.0/4 or 10/4.0
        System.out.println(d);

        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0); //2.5
        System.out.println(10.0/4.0); //2.5

        float f1=10/4; //float f1=2;
        System.out.println(f1);//2.0

        System.out.println(21%6);

        boolean evenNumber=25%2==0;
                        //1==0--> false
                        //if 25/2 has a remainder of zero, then it is an even number.
        System.out.println(evenNumber); //false
        System.out.println(25%2);

        boolean oddNumber=22%2!=0; //odd number
                            //0!=0--->false
        System.out.println(oddNumber);
        System.out.println(10%2==0); //10 is an even number
        System.out.println(11%2==0); //11 is an odd number

        System.out.println("10 is an even number: "+(10%2==0));
        System.out.println("11 is an even number: "+(11%2==0));
        System.out.println("25 is an odd number: "+(25!=0));
        System.out.println("25 is an even number: "+(25%2==0));
        System.out.println("25 is an even number: "+!(25!=0));

    }
}
