package day25_MethodsRecap;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

public class Frequency {
    public static void main(String[] args) {


        String str1 = "JavaJavaJavaJavaJavaJavaJava";
        String str2 = "Java";

        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1= str1.replaceFirst(str2, "");
            //we need to make that we are not sounting the same index over again
        }

        System.out.println(count);

        String a="python python python python";
        String b="python";
        int num1=Frequency(a,b);
        System.out.println(num1);

    }
    public static int Frequency(String str1, String str2){
        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1= str1.replaceFirst(str2, "");
            //we need to make that we are not sounting the same index over again
        }
        return count;
    }
}
