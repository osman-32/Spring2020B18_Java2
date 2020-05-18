package day41_Inheritance.Test;

public class Employee {
    public String name;
    public double salary;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString(){
        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: $"+salary+", ID: "+id+", Gender: "+gender;
    }
}
