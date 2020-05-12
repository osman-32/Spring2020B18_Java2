package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleObject {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.000");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");

        double r=input.nextDouble();

        Circle circle1=new Circle(r);
        double areaOfCircle=circle1.area();
        System.out.println("Area of the circle is "+areaOfCircle+".");
        System.out.println("Perimeter is "+df.format(circle1.perimeter())+".");
        System.out.println("Diameter is "+circle1.diameter+".");

    }
}
