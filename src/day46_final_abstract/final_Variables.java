package day46_final_abstract;

public class final_Variables {

    final int InstanceVariable=300;
   // final int InstanceVariable2=400; //final instance variables need to be initialized immidiately

    final static int staticVariables=1000;

    static int staticVariables2;
    public static void main(String[] args) {
        final double PI=3.14;
       // PI=3.16;

        final String gender="Male";
        //gender="Female";

        final int score;
        score=100;
        //score=200;
        System.out.println(score);

        System.out.println("===========================================");
        //instancevariable=400;

        final_Variables obj=new final_Variables();
        //obj.InstanceVariable=400;

        //staticVariables=2000;

    }
}
