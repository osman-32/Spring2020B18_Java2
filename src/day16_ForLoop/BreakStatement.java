package day16_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.println("Hello World!");
            if (i==3) {
                break; //when the compiler hits the break, the loop will be closed after first execution.
            }

        }
        for (char i='a'; i<='z'; i++){
            System.out.println(i);
            if (i=='g') {
                break;
            }
        }
    }
}
