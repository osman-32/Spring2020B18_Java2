package OfficeHours.Practice_05_20_2020;

public class Pet {
    /*
    custon class: pet
            variables: name, age, color, size, breed, isPet(), numberOfEyes

            methods: eat, sleep, drink, toString, setInfo
     */

    protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;

    protected static boolean isPet=true;
    protected static int numberOfEyes=2;

    public void setInfo(String name, int age,String color, String size, String breed){
        this.name=name;
        this.age=age;
        this.color=color;
        this.size=size;
        this.breed=breed;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(String place){
        System.out.println(name+" is sleeping at "+place);
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Color: "+color+", Size: "+size+", Breed: "+breed;
    }

}
