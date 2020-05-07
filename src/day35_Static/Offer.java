package day35_Static;

public class Offer {
    /*
    1. Create a class called offer that has:
        instance fields:
            location, company, salary, isFullTime
        Instance methods:
            setOfferInfo: can set the location, company, salary, isFullTime of the offer
            toString-- pring all info about offers
     */
    String location;
    String company;
    double salary;
    boolean isFullTime;
    public void setInfo(String location, String company,double salary, boolean isFullTime){
        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isFullTime=isFullTime;
    }

    public String toString(){
        return "Location: "+location+", Company: "+company+", Salary: $"+salary+", Fulltime: "+isFullTime;
    }
}
