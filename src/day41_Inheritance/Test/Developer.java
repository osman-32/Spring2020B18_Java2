package day41_Inheritance.Test;

import day41_Inheritance.Test.Employee;

public class Developer extends Employee {
    /*
    create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer
     */

    /*
    salary      (inherited)
    name        (inherited)
    id          (inherited)
    jobTitle    (inherited)
    gender      (inherited)

    fixingBug
    coding
     */
    public Developer(double salary,String name, long id, String jobTitle, char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void fixingBug(){
        System.out.println(name+" is fixing the bug");
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
}
