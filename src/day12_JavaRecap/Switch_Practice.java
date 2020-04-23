package day12_JavaRecap;

public class Switch_Practice {
    public static void main(String[] args) {
        switch (3){
            default:
                System.out.println("Invalid Case");
                break;
            case 1:
                System.out.println("Case 1");
                break; //exits switch statement

            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
        }
        System.out.println("=====================================================================");
        /*
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable
         */


        int statusCode=200; //can not use long, double, float, boolean
        switch (statusCode){
            case 200:
                System.out.println("Ok");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanently");
                break;
            default:
                System.out.println("Invalid Status Code");
                break;
        }
    }
}
