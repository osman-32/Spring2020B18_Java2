package day42_inheritance.Task02;
/*
	create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString
 */

public class TV extends Device{
    /*
    brand         (inherited)
    model         (inherited)
    price         (inherited)
    country       (inherited)
    Type          (inherited)
    size          (inherited)

    setDevice     (inherited)
    watch()
    toString()    (inherited)
     */

    public TV(String brand, String model, double price, String size){
        setDevice(brand, model, price, "TV", size);
    }

    public void watch(){
        System.out.println("watching "+brand+" TV");
    }


}
