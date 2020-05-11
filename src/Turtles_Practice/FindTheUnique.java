package Turtles_Practice;

public class FindTheUnique {
    public static void main(String[] args) {
        String str="assdgggdsassadfs";
        System.out.println(unique(str));

    }

    public static String unique(String str){
        String result="";
        for(int i=0; i<str.length(); i++){
            if(!result.contains(""+str.charAt(i))){
                result+=""+str.charAt(i);
            }
        }
        return result;
    }
}
