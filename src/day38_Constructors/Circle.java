package day38_Constructors;

public class Circle {
    /*
    Create a class called Circle
            instance variables:
                radius, pi, diamter

             add a constructor taht can initialize the radius of the circle
             instance methods:
                       area(): can return the area of the circle as double
                       perimeter (): can return the perimeter of the circle as double
                       toString(): returns the info of the circle
              Note: global value of PI is 3.14
                    diameter of circle =2*radius
                    area of circle=PI*r*r;
     */

    static double PI=3.14;
    double radius;
    double diameter;

    public Circle(double radius){
        this.radius=radius;
        diameter=radius*2;
    }

    public double area(){
        return PI*radius*radius;
    }

    public double perimeter(){
        return 2*PI*radius;
    }

    public String toString(){
        return "Circle radius: "+radius+" Circles diameter: "+diameter+" Circles area: "+area()+" Circles perimeter: "+perimeter();
    }
}
