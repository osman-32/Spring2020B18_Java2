package day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {
        SalaryCalculator zareen = new SalaryCalculator(50, 40, 0.0825, 0.2);
        System.out.println(zareen);
        System.out.println("===========================");
        SalaryCalculator namik=new SalaryCalculator(62,40,0.0875,0.2);
        System.out.println(namik);
        System.out.println(namik.salary());
    }
}
