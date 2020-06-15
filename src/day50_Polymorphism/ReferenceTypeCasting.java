package day50_Polymorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b=(double) a; //implicitly done

        Dog dog = new Dog("a", "f",1);

        Animal animal1= (Animal) dog; //upcasting, done implicitly

        Cat cat = new Cat("r","female",4);
        //Dog dog2=(Dog) cat;

        Animal animal2 = (Animal) cat; // upcasting, done implicitly (automatically)

        System.out.println("======================================================");

        double c=10;
        int d=(int) c; // explicitly done

        Animal animal3=new Dog("A","F", 12);

        Dog dog3 = (Dog) animal3;

        Animal animal4 = new Cat("C", "F", 5);

        Cat cat2=(Cat) animal4;

        System.out.println("======================================================");

        Dog animal5 = new Dog("Lucy","Female",3);

       // animal5.bark();

        Dog dog2 = (Dog) animal5;
        dog2.bark();
         //second way:

        ((Dog) animal5).bark();




    }
}
