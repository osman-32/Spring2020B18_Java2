package day46_final_abstract;

public class rectangle extends Shape {
    public double width;
    public double length;

    public rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    @Override
    void Area(){
        double area=width*length;
        System.out.println("Area of rectangle is: "+area);
    }
}
