package OfficeHours.Practice_05_20_2020;

public class Bunny extends Pet{
    /*
    Variables: name, age, color, size, breed, isPet, numberOfEyes;
            methods: eat, sleep, drink, to String, dig
       not inherited: dig
     */

    public void dig(){
        System.out.println(name+" is digging");
    }

    public Bunny(String name, int age, String color, String size, String breed){
        setInfo(name, age,color, size,breed);
    }
}
