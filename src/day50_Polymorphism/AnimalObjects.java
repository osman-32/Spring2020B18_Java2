package day50_Polymorphism;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1=new Dog("Lucy", "Female", 5);

        System.out.println(dog1.dogName);
        dog1.bark();

        Animal dog2=new Dog("Kito", "Female", 6);
        //System.out.println(dog2.dogName); dogName is created in Dog class, however dog2 is created by refering Animal class
       // dog2.bark();

        dog2.eat();

        dog2.methodA();

        dog1.methodA(2);

        Animal animal1=new Cat("A","F",4);

        if (animal1 instanceof Cat){
            System.out.println("It is a cat");
        }else {
            System.out.println("It is a dog");
        }

        Animal d1= new Dog("A", "f",1);

        boolean r1= d1 instanceof Cat;

        Animal animal2 = new Cat("Q", "f", 2);

        boolean r2= animal2 instanceof Dog;
        System.out.println(r2);


    }
}
