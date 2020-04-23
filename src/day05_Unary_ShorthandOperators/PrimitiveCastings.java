package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {
        int a=10;
        long b=a; //implicit casting is done automatically
                    //b=10L;

        //int c=b; b is still long data type.

        int a1=100;
        long b1=(long) a1; //manually doing the implicit casting;

        //int c1=b1;

        //Explicit casting

        int Inum=100;
        byte Bnum=(byte)Inum;

        short Snum=(byte)Inum;
        short Snum1=(short)Inum;

        double Dnum=5.5;
        //float Fnum=(float)Dnum; //5.5
        //System.out.println(Fnum+1);
        float Fnum=(int)Dnum;
        System.out.println(Fnum); //5.0

        double D1=10.5;
        long L1=(long)((float)D1);
        System.out.println(L1); //10, because of long

        float F1=60.5f;
        int I1= (int) F1; //preferred

        long largenumber=999999999999l;

        int intNum= (int) largenumber;
        System.out.println(intNum); //it gives a different num because 999999999999 is out of int's range.

        char ch1='a';
        short sh1= (short) ch1;
        System.out.println(sh1);

        char ch2=23465;

        double dbl1=ch2; //23465
        System.out.println(dbl1);
        System.out.println(ch2);

        int z1=10;
        double t1=z1; //10.0





    }
}
