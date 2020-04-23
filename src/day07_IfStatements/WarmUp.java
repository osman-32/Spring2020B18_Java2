package day07_IfStatements;

public class WarmUp {
    /*
    1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.
	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
	3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
	4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)
	5. write a java program that can identify if a person is eligible to vote for Donald Trump

     */
    public static void main(String[] args) {

        double angle1=10;
        double angle2=30;
        double angle3=45;

        short sumOfAngles=(short)(angle1+angle2+angle3);

        boolean validTriangle=sumOfAngles==180;

        if(validTriangle){
            System.out.println("ABC is a valid triangle.");
        }
        if(!validTriangle){
            System.out.println("ABC is not a valid triangle.");
        }
        System.out.println("===========================================================================");
        double x=124.3;
        double y=324.4;
        double z=-42323;
        if(x>y && x>z){
            System.out.println(x+" is maximum number");
        }
        if(y>x && y>z){
            System.out.println(y+" is maximum number");
        }
        if(z>x && z>y){
            System.out.println(z+" is maximum number");
        }
        System.out.println("===========================================================================");

        if(x<y && x<z){
            System.out.println(x+" is minimum number");
        }
        if(y<x && y<z){
            System.out.println(y+" is minimum number");
        }
        if(z<x && z<y){
            System.out.println(z+" is minimum number");
        }
        System.out.println("===========================================================================");
        if((x>y && x<z) || (x<y && x>z) ){
            System.out.println(x+" is medium number");
        }
        if((y>x && y<z) || (y<x && y>z) ){
            System.out.println(y+" is medium number");
        }
        if((z>x && z<y) || (z<x && z>y) ){
            System.out.println(z+" is medium number");
        }
        System.out.println("===========================================================================");
        int age=17;
        boolean UScitizen=true;
        boolean eligible=age>=18 && UScitizen==true;
        if(eligible){
            System.out.println("You are eligible to vote");
        }
        if(!eligible){
            System.out.println("You are not eligible to vote");
        }





    }
}
