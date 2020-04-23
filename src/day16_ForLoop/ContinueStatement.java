package day16_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){//i:1, 2, 3, 4, 5
            System.out.println(i);
            if (i==3) {
                continue; //skips 3
            }

        }
        for (int i=0; i<=20; i++){
            if (i%2!=0){
                continue; //skips all the odd numbers
            }
            System.out.print(i+" ");
        }
    }
}
