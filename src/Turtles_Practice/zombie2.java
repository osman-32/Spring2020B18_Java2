package Turtles_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class zombie2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int[] arr=new int[inhabitants.length]; //arr=[0,0,0,0,0,0,0,0]
        int j=0;
        do {
            System.out.println("Day "+j+" "+Arrays.toString(inhabitants));
            j++;
            for(int i=0; i<inhabitants.length; i++){
                inhabitants[i]/=2;
            }
        }while(!Arrays.equals(inhabitants,arr));
        System.out.println("Day "+j+" "+Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");


    }
}
