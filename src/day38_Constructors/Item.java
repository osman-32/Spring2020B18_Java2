package day38_Constructors;
/*
create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */

public class Item {
    String name;
    double unitPrice;
    int quantitiy;

    public Item(String name, double unitPrice, int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantitiy=quantity;
    }

    public double calcCost(){
        return quantitiy*unitPrice;
    }

    public String toString(){
        return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantitiy+"\nTotal Cost of Item: $"+calcCost();
    }

}
