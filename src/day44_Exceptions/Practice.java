package day44_Exceptions;

public class Practice {
    public static void main(String[] args) {
        /*
        print hello,
         wait two seconds
         print Cybertek,
         wait three seconds
         print Java
         */
        System.out.println("Hello");
        Practice2.waits(2);
        System.out.println("Cybertek");
        Practice2.waits(3);
        System.out.println("Java");
        Practice2.waits(4);
        System.out.println("Completed");

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
