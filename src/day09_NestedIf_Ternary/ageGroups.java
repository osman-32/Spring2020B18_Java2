package day09_NestedIf_Ternary;

/*
write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */

public class ageGroups {

    public static void main(String[] args) {
        String result="";
        int age=45;
        boolean age1= age>0 && age<3;
        boolean age2= age>=3 && age<=5;
        boolean age3= age>=6 && age<=9;
        boolean age4= age>=10 && age<=12;
        boolean age5= age>=13 && age<=17;
        boolean age6= age>=18 && age<=20;
        boolean age7= age>=21 && age<=39;
        boolean age8= age>=40 && age<=49;
        boolean age9= age>=50 && age<=54;
        boolean age10= age>=55 && age<=64;
        boolean age11= age>=65 && age<=74;
        boolean age12= age>=75 && age>=84;
        boolean age13= age>=85 && age<=120;

        if(age1){
            result="baby";
        }else if(age2){
            result="Toddler";
        }else if(age3){
            result="Kid";
        }else if(age4){
            result="Pre-teen";
        }else if(age5){
            result="Teenager";
        }else if(age6){
            result="Young Adult";
        }else if(age7){
            result="Adult";
        }else if(age8){
            result="Young Middle-Aged Adult";
        }else if(age9){
            result="Middle-Aged Adult";
        }else if(age10){
            result="Very Young Senior Citizen";
        }else if(age11){
            result="Young Senior Citizen";
        }else if(age12){
            result="Sinior Citizen";
        }else if(age13){
            result="Old Senior Citizen";
        }else{
            result="invalid entry";
        }

        System.out.println(result);

        boolean eligibleToBuy= result=="Adult" || result=="Young Middle-Aged Adult " || result=="Mioddle-Aged Adult";

        if(eligibleToBuy){
            System.out.println("You are eligible to buy alcohol.");
        } else if(!eligibleToBuy){
            System.out.println("Your are not eligible to buy alcohol.");
        }

    }
}
