package Turtles_Practice;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        divides(30,4);

    }

    public static void divides(int a, int b){
        int count=0;
        if (b==0) {
            System.out.println("invalid entry");
            return;
        }
        System.out.print(b+" divide "+a+" is ");
         while (a>b){
             count++;
             a-=b;
         }
        System.out.println(count+" and the remainders is "+a );
    }
}
