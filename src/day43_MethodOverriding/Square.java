package day43_MethodOverriding;

public class Square extends Shape {
    public double side;

    public Square(double side){
        this.side=side;
    }
@Override
    public void calculateArea() {
        area=side*side;
        System.out.println("Area of the square is "+area);

    }

    public void calculatePerimeter(){
        perimeter=4*side;
        System.out.println("The perimeter of the rectangle is "+perimeter);
    }
}
