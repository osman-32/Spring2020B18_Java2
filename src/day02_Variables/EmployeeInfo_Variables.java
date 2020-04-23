package day02_Variables;

public class EmployeeInfo_Variables {

    /*
    Create a class called EmployeeInfo_Variables:
            print:
                companyName
                EmployeeName
                EmployeeId
                JobTitle
                Salary
                SSN
     */
    public static void main(String[] args) {
        String employeeName="Andrea";
        String companyName="Oracle";
        int employeeId=9;
        String jobTitle="QA";
        double salary=100000.5;
        long SSN=123423454l;
        //Employee name: Andrea
        /*
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+salary);
        System.out.println("SSN: "+SSN);
         */
        System.out.println("Employee Name: "+employeeName+" \nCompany Name: "
                +companyName+" \nEmployee Id: "+employeeId+" \nJob Title: "+jobTitle+
                " \nSalary: "+salary+" \nSSN: "+SSN);

        System.out.println("===================================================");
        String firstname="Osman";
        String lastname="Yardimci";
        //Full Name: Osman Yardimci
        System.out.println("Full Name: "+firstname+" "+lastname);

        System.out.println(11+21); //32, addition
        System.out.println("11"+"12"); //1112, concatenation





    }
}
