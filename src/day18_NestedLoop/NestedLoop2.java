package day18_NestedLoop;

public class NestedLoop2 {
    public static void main(String[] args) {
        int j=0;
        for (int i=0; i<=5; i++){
            j=i;
            for(int k=0; k<=j; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int k=5; k>=0; k--){
            for (int i=1; i<=k; i++){
                System.out.print("* ");
            }
            System.out.println();
        }

       for (char z='z'; z>='a'; z--){
           for (char ch='a'; ch<=z; ch++){
               System.out.print(ch+" ");
           }
           System.out.println();
        }

        for (char z='a'; z<='e'; z++){
            for (char ch='a'; ch<=z; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
