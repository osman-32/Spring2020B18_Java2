package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {
        Person Zarina=new Person("Zarina");
        System.out.println(Zarina.name);
        //System.out.println(Zarina.SSN);

        System.out.println("Zarina's SSN "+Zarina.getSSN());

       // System.out.println(Zarina.ID);

        Zarina.setID(567);
        System.out.println("Zarina's ID "+Zarina.getID());

    }
}
