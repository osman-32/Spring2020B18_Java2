package day26_MethodOverloading;

public class MethodOverloading3 {
    /*
    first method: can find the sum of two int numbers
    second method: can find the sum of two double numbers
     */
    public static void main(String[] args) {
        sum(10,30);
        sum(3.3, 4.2);
        double a=sum(10,15.5);
        System.out.println(a);

        double b=sum(25l,30l);
        System.out.println(b);





    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static double sum(double a, double b){//in method overloading, return type doesn't matter
        return a+b;
    }
    /*
    0 1 1 2 3 5 8 13 21 34 55 89 ..

    arr[i+2]=arr[i]+arr[i+1];





     */



}
