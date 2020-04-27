package Turtles_Practice;

public class Methods166 {
    public static void main(String[] args) {
        String one="12345";
        String two="abcdexyz";
        int length1=one.length();
        int length2=two.length();

        int min=length1;
        if(length1>length2){
            min=length2;
        }
        String result="";
        for(int i=0; i<min; i++){
            result+=""+one.charAt(i)+two.charAt(i);
        }
        if(min==length1){
            result+=two.substring(min);
        }else{
            result+=one.substring(min);
        }
        System.out.println(result);
    }
}
