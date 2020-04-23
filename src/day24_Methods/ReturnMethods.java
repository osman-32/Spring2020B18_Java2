package day24_Methods;

public class ReturnMethods {
    public static void maximum(int a, int b){
        if (a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

      int result=Addition(1000,2000);
        System.out.println(result);
      int result2=2000+result;
        System.out.println(result2);

    }
    public static int Addition(int a, int b){
        return a+b;
    }
}
