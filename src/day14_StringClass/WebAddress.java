package day14_StringClass;

public class WebAddress {
    /*
    write a program that can validate if a weba ddress is valid
    valid web address:
    MUST start with www.
    Must ends with  .com, or .edu, .net, .Gov
                    .COM     .EDU  .NET  .GOV
     */
    public static void main(String[] args) {
        String website="WWW.cybertek.Gov";
        website=website.toLowerCase();
        boolean validEnding=website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".net")||website.endsWith(".gov");
        if (website.startsWith("www.")&&validEnding){
            System.out.println("valid address");
        }else {
            System.out.println("Invalid Address");
        }
    }
}
