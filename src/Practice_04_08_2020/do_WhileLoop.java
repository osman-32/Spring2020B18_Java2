package Practice_04_08_2020;

public class do_WhileLoop {
    public static void main(String[] args) {
        /*
        do{
        statements;

        }while(condition);

        execution order:
            1.statements;
            2. condition
                if true: executes statements
                if false: stops the loop
         */

        boolean b=false;
         while (b){
            System.out.println("Hello World");
        }
        System.out.println("==================");
         do {
             System.out.println("Hello World");
         }while (b);

        System.out.println("========================");
        int j=0;
        do {
            if (j%15==0) {
                System.out.print(j + " ");
            }
            j++;
        }while (j<=100);

    }
}
