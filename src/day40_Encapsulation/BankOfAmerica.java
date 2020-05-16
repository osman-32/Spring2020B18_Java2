package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {
        EmployeeInfo Abdul=new EmployeeInfo();
        Abdul.setAddress("Virginia");
        Abdul.setSalary(1200000);

        System.out.println(Abdul.getAddress());
        System.out.println(Abdul.companyName);
        System.out.println(Abdul.getSalary());
    }
}
