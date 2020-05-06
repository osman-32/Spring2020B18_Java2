package OfficeHours.Practice_05_06_2020;

public class AppleINC {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setInfo("Onur","Junior Tester",75000,1234);

        Tester tester2=new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,1245);

        Tester tester3=new Tester();
        tester3.setInfo("Rahman", "SDET",120000,222222);

        ScrumTeam scrum1=new ScrumTeam();//we can use the arraylists in scrumteam class
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);

        scrum1.fireATester(1245);

        for(Tester each:scrum1.testersTeam){//prints out everysingle tester from scrumteam
            System.out.println(each);
        }
        System.out.println("==============================================================");
        Developer dev1=new Developer();
        dev1.setInfo("Barzy","Senior Developer",120200,112334343);
        Developer dev2= new Developer();
        dev2.setInfo("Emrah", "Usta Developer", 300000,223232);

        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);

        scrum1.fireADeveloper(112334343);

        System.out.println(scrum1.devpTeam.size());

        for (Developer each:scrum1.devpTeam){
            System.out.println(each);
        }
        System.out.println("=================================================================");
        System.out.println("In my scrum team, we have "+scrum1.testersTeam.size()+" testers and "+scrum1.devpTeam.size()+" developers");

        /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers

        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator teh array to print out all the testers who have salary>120000
            2. print out all the developers who have salary<120000

         creat an ArrayList of scrum: {scrum1, scrum2, scrum3}
            1. remove all the testers who have salary<100000
            2. remove all the developers who have salary<120000

         NOTE: DO NOT create any ArrayList of Testers or Developers. Use the ArrayList in ScrumTeam class only

         */
    }
}
