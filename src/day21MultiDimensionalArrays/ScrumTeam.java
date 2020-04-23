package day21MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
        String[] DevTeam={"Zeynep","Haider","Jovid","Muhtar"};
        String[] TestersTeam={"Rahman","Aishan","Osman","Ali"};
        String [] PO={"Barzy","Donald"};

        String[][] ScrumTeam={DevTeam,TestersTeam,PO};
        ScrumTeam[0][3]="James";
        System.out.println(ScrumTeam[0][3]);

        String info=ScrumTeam[1][2];
        System.out.println(info);
        System.out.println("===================================");
        for (String eachEmployee:ScrumTeam[1]){
            System.out.println(eachEmployee);
        }
    }
}
