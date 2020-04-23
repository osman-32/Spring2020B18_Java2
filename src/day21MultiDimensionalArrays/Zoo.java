package day21MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {
        String[] wildAnimals={"Tiger","Lion","Monkey","Turtle","Crocodile"};
        String[] birds={"Eagle","Ducks","Peacock","Chicken"};

        String[][] zoo={wildAnimals,birds};
        String kfc=zoo[1][3]; //Chicken

        System.out.println(kfc);
        System.out.println("=======================");

        for (String eachBirds:zoo[1]){
            System.out.println(eachBirds);
        }
        System.out.println("============================");
        for (String each:zoo[0]){
            System.out.println(each);
        }
    }
}
