package day46_final_abstract;

public class triangle extends Shape {
    public double hight;
    public double base;

    public triangle(double hight,double base){
        this.hight=hight;
        this.base=base;
    }

    @Override
    void Area(){
        double area=hight*base*1/2;
        System.out.println("Area of triangle is: "+area);
    }
}
