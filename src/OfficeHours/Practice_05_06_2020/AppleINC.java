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
    }
}
