package Practice_03_25_2020;

public class ExplicitCasting_Practice {
    public static void main(String[] args) {
        int iNum=200;

        short sNum=(short)iNum; //explicit casting

        float fNum= (float) 0.5;

        System.out.println(fNum);

        float fNum2= (long) 0.5; //0.0
        System.out.println(fNum2);

        //long, int, short, byte===>only accets whol numbers

        long lNum1= (long) 4.5;
        System.out.println(lNum1);

        System.out.println(9/2);

        System.out.println(9/(float)2);

        System.out.println(10.0/3);
        System.out.println(10/3);

        float n1=10f;
        double n2=n1;
        float n3=(float)n2;

    }
}
