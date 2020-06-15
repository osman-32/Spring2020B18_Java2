package day49_Polymorphism;
interface downloadable{
    boolean downloadable=true;  //public static final
    void download(); //public abstract
}

interface AndroidApps extends downloadable{ // this interface has 2 variables (one is coming from the inherited interface), one abstract method
    String AppStoreName="Android";
}

interface AppleApps extends downloadable{ // this interface has 2 variables and one abstract method
    String AppStoreName="Apple Store"; // public static final
}


public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    public String toString(){
        return "brand= "+brand+", model= "+model+", price= $"+price+", size= "+size;

    }
}
