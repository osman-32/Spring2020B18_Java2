package OfficeHours.Practice_05_20_2020;

public class Dog extends Pet {
    /*
    Dog:
            Variables: name, age, color, size, breed, isPet, numberOfEyes;
            methods: eat, sleep, drink, to String, bark
       not inherited: bark
     */

    public void bark(){
        System.out.println(name+" is barking");
    }

    public Dog(String name, int age, String color, String size, String breed){
        setInfo(name, age,color, size,breed);
    }
/*
    public void setInfo(String name, int age,String color,String size, String breed){
        setInfo(name,age,color,size,breed);
    }

 */



}
