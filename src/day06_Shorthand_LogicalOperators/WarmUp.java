package day06_Shorthand_LogicalOperators;

public class WarmUp {
    /*
            1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
            2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
            3. manually calculate the following code fragements:
                1.  int a = 200;
                    int b = -a++ + - --a * a-- % 2
                     b = ?
                2.  int x = 300;
                    int y = 400;
                    int z = x + y - x * y +x / y;
     */

    public static void main(String[] args) {
        double numberOfGalons=3.884;
        double galonsToLiters=numberOfGalons*3.785;
        String result1=numberOfGalons+" galons equal to "+galonsToLiters+" liters.";
        System.out.println(result1);
        System.out.println("=====================================================================");
        double numberOfLiters=3.785;
        double litersToGalons=numberOfLiters/3.785;
        String result2=numberOfLiters+" liters equal to "+litersToGalons+" galons.";
        System.out.println(result2);
        System.out.println("====================================================================");
        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        System.out.println(b);
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        System.out.println(z);




    }
}
