package day45_Exceptions;

public class ThrowKeyword {
    public static void method1() throws Exception{
        Thread.sleep(3000);
    }

    public static void main(String[] args) throws Exception {
        method1();
    }
}
