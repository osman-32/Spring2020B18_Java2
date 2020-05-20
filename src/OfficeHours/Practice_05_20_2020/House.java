package OfficeHours.Practice_05_20_2020;

public class House {
    public static void main(String[] args) {
        Dog dog1=new Dog("Karabas ",3, "black","big","Husky");

        Dog dog2=new Dog("Rindik",5,"White","Huge","Kangal");

        System.out.println(dog1);
        System.out.println(dog2);

        dog2.bark();

        Cat cat1=new Cat("Muffin", 7,"White", "Medium","Ragdoll");
        cat1.scratch();

        System.out.println(cat1);

        Bunny bunny1=new Bunny("kivrishk",4,"white","small","Rex");

        System.out.println(bunny1);
        bunny1.dig();

    }
}
