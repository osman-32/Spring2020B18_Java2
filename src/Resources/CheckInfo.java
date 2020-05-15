package Resources;

import day39_AccessModifiers.PersonalInfo;

public class CheckInfo {
    public static void main(String[] args) {
        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);

        //System.out.println(PersonalInfo.grae); default variables cannot be access from another package
        //System.out.println(PersonalInfo.age);

        //System.out.println(PersonalInfo.SSN); private variables are accessible only in the class

        PersonalInfo obj=new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

        //System.out.println(obj.grade);
        //System.out.println(obj.age);

        //System.out.println(obj.SSN);
        //System.out.println(obj.ID);





    }
}
