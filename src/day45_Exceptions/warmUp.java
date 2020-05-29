package day45_Exceptions;

public class warmUp {
    public static void main(String[] args) {
        int pushups=0;
        while(pushups<50){
            System.out.println("Pushup "+(pushups+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pushups++;
        }
    }
}
