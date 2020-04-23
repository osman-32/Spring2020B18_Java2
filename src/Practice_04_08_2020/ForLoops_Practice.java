package Practice_04_08_2020;

public class ForLoops_Practice {
    public static void main(String[] args) {
        /*
        for(initialization; condition; iterator){

        }
        iterator: co-related to your condition
         */
        for (int i=1; i<=5; i+=2){
            System.out.println("Hello World");
        }
        System.out.println("======================");
        for (int i=1; i<=5;){
            System.out.println(i);
            i++;
        }
        System.out.println("======================");
        for (int i=1; i<=5;){
            i++;
            System.out.println(i);
        }
    }
}
