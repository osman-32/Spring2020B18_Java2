package day42_inheritance.Task02;
/*
	create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */


public class Phone extends Device {
    /*
    brand           (inherited)
    model           (inherited)
    price           (inherited)
    country         (inherited)
    type="Phone"    (inherited)
    size            (inherited)

    setDevice()     (inherited)

    call()
    text()
    toString()      (inherited)
     */
    public long number;

    public Phone(String brand, String model, double price, String size){
        setDevice(brand,model,price,"phone",size);
    }

    public void call(long number){
        System.out.println("Calling number: "+number);
    }

    public void text(){
        System.out.println("texting to: "+number);
    }
}
