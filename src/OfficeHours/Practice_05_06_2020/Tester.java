package OfficeHours.Practice_05_06_2020;

public class Tester {
    /*
    create a class called Testers
            Attributes:
                name, employeeID, JobTitle, Salary
            Actions:
                setTesterInfo(), smokeTesting(), creatingTicket();
     */
    String name;
    String jobTitle;
    double salary;
    long employeeId;

    public void setInfo(String name, String jobTitle,double salary,long employeeId){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.employeeId=employeeId;
    }

    public String toString(){
        return "Name: "+name+", job title: "+jobTitle+", salary $"+salary+", ID: "+employeeId;
    }

    public void smokeTesting(){
        int name=100;
        System.out.println(this.name+" is doing smoke test");
    }

    public void creatingTicket(){
        System.out.println(this.name+" is creating ticket on Jira");
    }
}
