package day08_IfStatements;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

public class equalNumbers {
    /*
    1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
	2.. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
     */
    public static void main(String[] args) {
        int days=0;
        double n1=34;
        double n2=34;
        double n3=34;

        if(n1==n2 && n1!=n3){
            System.out.println("n1&n2 are equal");
        }
        if(n2==n3 && n2!=n1){
            System.out.println("n2&n3 are equal");
        }
        if(n3==n1 && n3!=n2){
            System.out.println("n3&n1 are equal");
        }
        if(n1==n2 && n2==n3){
            System.out.println("all equal");
        }else{
            System.out.println("none of them are equal");
        }
        System.out.println("================================================================");
        String nameOfMonth= "March";
        if(nameOfMonth=="February"){
            System.out.println("Number of days of "+nameOfMonth+" is 28");
            days=28;
        }
        if(nameOfMonth=="April" || nameOfMonth=="June" || nameOfMonth=="September" || nameOfMonth=="November" ){
            System.out.println("Number of days of "+nameOfMonth+" is 30");
            days=30;
        }else{
            System.out.println("Number of days of "+nameOfMonth+" is 31");
            days=31;
        }
        System.out.println("==================================================================");
        System.out.println("Number of days of "+nameOfMonth+" is "+days);

    }
}
