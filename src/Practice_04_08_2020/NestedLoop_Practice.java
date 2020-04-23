package Practice_04_08_2020;

public class NestedLoop_Practice {
    public static void main(String[] args) {
        /*
        nested loop: loop inside another loop
                    inner loop & outer loop

              nested loop: we need to repeat a loop
         */
        int j=5;
        while (j<10){
            for (int i=10; i<=50; i+=10){
                System.out.print(i+" ");
            }
            System.out.println();
            j++;
        }

        System.out.println("=================");
        for (int k=0; k<=14; k++){
            for (int z=0; z<=19; z++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
