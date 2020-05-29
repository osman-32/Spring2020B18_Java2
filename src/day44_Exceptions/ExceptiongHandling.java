package day44_Exceptions;

public class ExceptiongHandling {
    public static void main(String[] args) {
        String str="Cybertek";

        try {
            System.out.println(str.charAt(400));
        }catch (RuntimeException e){
            String discription=e.getMessage();
            System.out.println(discription);
        }
        System.out.println("======================================================");

        String result="";

        try {
            System.out.println(100 / 0);
            System.out.println("Try block");
        }catch (ArithmeticException e){
            result=e.getMessage();
            System.out.println("Catch block");
        }

        System.out.println(result);
    }
}
