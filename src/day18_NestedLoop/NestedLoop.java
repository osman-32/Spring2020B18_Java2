package day18_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i=1; i<=6; i++){
            if (i%2==0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }
            if (i%2!=0) {
                for (int j = 5; j > 0; j--) {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }

        }
        int j=0;
        int i=0;
        while (j<7) {
            i=0;
            while (i < 7) {
                System.out.print("* ");
                i++;
            }
            System.out.println("");
            j++;
        }



    }
}
