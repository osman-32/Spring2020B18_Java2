package day22_Arrays_Loops;

public class NestedLoops2 {
    public static void main(String[] args) {
        int[][] numbers={{9,8,7},{6},{5,4,3,2,1,0}};

        for (int i=0; i<numbers.length; i++){
            for (int k=0; k<numbers[i].length; k++){
                System.out.print(numbers[i][k]+" ");
            }
            System.out.println();
        }

        for (int i=0; i<numbers.length; i++){
            for(int k=numbers[i].length-1; k>=0; k--){
                System.out.print(numbers[i][k]+" ");
            }
        }
        System.out.println();

        for (int i= numbers.length-1; i>=0; i--){
            for (int k=0; k<numbers[i].length; k++){
                System.out.print(numbers[i][k]+" ");
            }
        }
        System.out.println();

        for (int i= numbers.length-1; i>=0; i--){
            for (int k=numbers[i].length-1; k>=0; k--){
                System.out.print(numbers[i][k]+" ");
            }
        }

    }
}
