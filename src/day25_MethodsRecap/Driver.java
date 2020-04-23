package day25_MethodsRecap;

public class Driver {
    /*
    method decleration: Access-modifers Specifier return Type MethodName(parameter){
                statements;
            }
     */
    public static void main(String[] args) {
       // getDriver1(); argument is mandatory

        String str=getDriver1("fiREFox");//
        String str2=getDriver2("fireFox");
        String str3=getDriver3("chRome");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
    public static String getDriver1(String browserName){

        switch (browserName.toLowerCase()){
            case "chrome":
                return "Chrome Driver";

            case "firefox":
                return "Firefox Driver";

            case "safari":
                return "Safari Driver";

            case "opera":
                return "Opera Driver";

            case "edge":
                return "Edge Driver";

            default:
                return "Invalid Driver";
        }

    }
    public static String getDriver2(String browserName){

        if (browserName.equalsIgnoreCase("chrome")){
            return "Chrome Driver";
        }else if (browserName.equalsIgnoreCase("firefox")){
            return "Firefox Driver";
        }else if (browserName.equalsIgnoreCase("opera")){
            return "Opera Driver";
        }else if (browserName.equalsIgnoreCase("edge")){
            return "Edge Driver";
        }else if (browserName.equalsIgnoreCase("safari")){
            return "Safari Driver";
        }else{
            return "Invalid Browser";
        }
    }
    public static String getDriver3(String browserName){
        return (browserName.equalsIgnoreCase("chrome"))?"Chrome Driver"
        :(browserName.equalsIgnoreCase("firefox"))? "Firefox Driver"
        :(browserName.equalsIgnoreCase("opera"))?"Opera Driver"
        :(browserName.equalsIgnoreCase("edge"))?"Edge Driver"
        :(browserName.equalsIgnoreCase("safari"))?"Safari Driver"
        :"Invalid Browser";
    }
}
