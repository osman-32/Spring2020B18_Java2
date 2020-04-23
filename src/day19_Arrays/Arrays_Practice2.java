package day19_Arrays;

public class Arrays_Practice2 {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        System.out.println(arr.length);

        int[] arr2=new int[5];

        for (int i=0; i<5; i++) {
            int j=arr2[i];
            System.out.print(j);
        }
        System.out.println();
        String [] Testers=new String[3]; //{"Reem", "Madina", "Osman"};
        Testers[0]="Reem";
        Testers[2]="Osman";
        Testers[1]="Madina";

        System.out.println(Testers[0]);
        System.out.println(Testers[1]);
        System.out.println(Testers[2]);

        System.out.println(Testers.length);
        System.out.println("=============================");

        String[] students=new String[10];
        //write a program that asks "enter"  a name

    }
}

