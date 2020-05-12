package day37_Constructors;

public class CybertekStudents {
    static String schoolName;
    String studentName;
    int groupNumber;
    String batch;
    public CybertekStudents(String studentName,int groupNumber,String batch){
        schoolName="Cybertek University";
        this.studentName=studentName;
        this.groupNumber=groupNumber;
        this.batch=batch;
    }

    public String toString(){
        return "Student Name: "+studentName+" Batch: "+batch+ " Group Number: "+groupNumber+" School:"+schoolName;
    }
}

class CObjects{
    public static void main(String[] args) {
        CybertekStudents student1=new CybertekStudents("Osman",3, "Batch 18");
        System.out.println(student1);

        CybertekStudents student2=new CybertekStudents("Saban",12,"Batch 18");
        System.out.println(student2);
    }
}