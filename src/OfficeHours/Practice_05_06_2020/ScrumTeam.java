package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {
    ArrayList<Tester> testersTeam=new ArrayList<>();

    public void hireATester(Tester tester){
        testersTeam.add(tester);
    }

    public void fireATester(long id){
        testersTeam.removeIf(p->p.employeeId==id);
    }
}
