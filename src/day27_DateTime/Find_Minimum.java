package day27_DateTime;

public class Find_Minimum {
    public static void main(String[] args) {
        int [] arr={5,4,7,5};
        int minimum=arr[0];

        for (int each:arr){
            if (each<minimum){
                minimum=each;
            }
        }
        System.out.println(minimum);
        int[] arr2={100,2000, 3000,40,50,-100,-9000};
        System.out.println(minimum(arr2));

        double[] arr3={55,10.5,1.5,2.5,0,-10.25};
        double num1=minimum(arr3);
        System.out.println(num1);
    }
    public static int minimum(int [] arr){
        int minimum=arr[0];

        for (int each:arr){
            if (each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }
    public static double minimum(double[] arr){
        double minimum=arr[0];

        for (double each:arr){
            if (each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }
}
