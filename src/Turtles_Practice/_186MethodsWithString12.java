package Turtles_Practice;

public class _186MethodsWithString12 {
    public static void main(String[] args) {
        String str="34osman";
        System.out.println(extractNum(str));
        System.out.println(isError(str));
        String str1="he said bla bla bla";
        String str2="bla";
        System.out.println(clean(str1,str2));

        System.out.println(isPalindrome(str1));
    }
    public static String extractNum(String s) {
        String str="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'|| s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||
                    s.charAt(i)=='4'||s.charAt(i)=='5'|| s.charAt(i)=='6'||s.charAt(i)=='7'||
                    s.charAt(i)=='8'||s.charAt(i)=='9'){
                str+=""+s.charAt(i);
            }
        }
        return str;
    }
    public static boolean isError(String line)
    {
        boolean result=true;

        if(line.substring(0,5).equals("error")){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
    public static String clean (String text ,String badWord) {
        String[] str=text.split(" ");
        String result="";
        for(String each:str){
            if(each.equals(badWord)){
                continue;
            }
            result+=each+" ";
        }
        result=result.trim();
        return result;

    }

    public static boolean isPalindrome(String check) {

        String [] str=check.split(" ");
        String str1="";
        for(String each:str){
            str1+=each;
        }

        str1=str1.toLowerCase();

        String str2="";

        for(int i=str1.length()-1; i>=0; i--){
            str2+=""+str1.charAt(i);
        }
        if(str1.equals(str2)){
            return true;
        }

        return false;

    }
}
