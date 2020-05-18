package day41_Inheritance.Test;

public class EmployeeObjects {
    public static void main(String[] args) {

        Developer dev1=new Developer(120000,"Namik",123,"Software Developer",'M');

        dev1.fixingBug();
        System.out.println(dev1);

        Tester tester1=new Tester("Hilal", 120000,456,"SDET",'F');

        tester1.reporting();

        BusinessAnalyst BA1=new BusinessAnalyst("Ozgur",120000,789,'M');

        BA1.writingReq();
        BA1.gathering();

        System.out.println(BA1);

    }
}
