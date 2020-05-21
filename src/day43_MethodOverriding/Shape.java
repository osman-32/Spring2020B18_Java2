package day43_MethodOverriding;

/*
. create a class called ShapeActions:
                methods: calculateArea(), calculatePerimeter()
 */

public class Shape {

    public double area;
    public double perimeter;

    public void calculateArea(){
        area=0;
        System.out.println(("Area of shape is "+area));
    }

    public void calculatePerimeter(){
        perimeter=0;
        System.out.println("Perimeter of the shape is "+perimeter);
    }

}
