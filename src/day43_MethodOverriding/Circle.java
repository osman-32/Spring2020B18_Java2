package day43_MethodOverriding;

public class Circle extends Shape {
    public  double radius;
    public static double PI=3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    /*
    calculateArea & calculatePerimeter
     */

    public void calculateArea(){
        area=radius*radius*PI;
        System.out.println("Area of the Circle is "+area);
    }

    public void calculatePerimeter(){
        perimeter=2*radius*PI;
        System.out.println("Perimeter of the Circle is "+perimeter);
    }
}
