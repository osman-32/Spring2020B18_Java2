package day24_Methods;

public class BirthYear {

    public static void Age(int birthYear){
        int currentYear=2020;
        int age=currentYear-birthYear;
        if (birthYear<currentYear && birthYear>1900) {
            System.out.println(age);
        }else{
            System.out.println("Invalid entry");
        }
    }

    public static void main(String[] args) {
        int a=2002;
        Age(2000);
        printHelloCybertek();
    }
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }
    public static void printHelloCybertek(){
        printCybertek();
        printHello();
    }
}
