package OfficeHours.Practice_05_06_2020;

public class Developer {
    /*
   create a class called Testers
           Attributes:
               name, employeeID, JobTitle, Salary
           Actions:
               setDeveloperInfo(), coding(), fixingBugs()
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

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixingBug(){
        System.out.println(name+" is crying");
    }
}
