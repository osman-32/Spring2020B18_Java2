package day45_Exceptions;

public class ThrowsKeyword {
    public static void sleep1(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep2() throws InterruptedException{
        Thread.sleep(3000);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Cybertek");
        sleep2();
        System.out.println("Java");
    }

    public static void sleep3() throws Exception{
        Thread.sleep(3000);
    }
}
