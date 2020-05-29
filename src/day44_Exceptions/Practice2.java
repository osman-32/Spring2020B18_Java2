package day44_Exceptions;

public class Practice2 { //important, will be used in selenium
    public static void main(String[] args) {
        System.out.println("Hello");
        waits(5);
        System.out.println("Cybertek");
    }

    public static void waits(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        }catch (Exception e){

        }
    }

}
