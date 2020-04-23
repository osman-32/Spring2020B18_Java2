package day08_IfStatements;

public class MultiBranchIf {
    public static void main(String[] args) {
        String sign;

        double num=4;
        if(num>0){
            //System.out.println("positive");
            sign="positive";
        }else if(num<0){
            //System.out.println("negative");
            sign="negative";
        }else{
            //System.out.println("zero");
            sign="zero";
        }
        System.out.println(sign);
    }
}
