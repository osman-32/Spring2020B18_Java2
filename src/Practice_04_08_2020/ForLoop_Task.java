package Practice_04_08_2020;

public class ForLoop_Task {
    /*
    print all the numbers between 0~100 that can be divisible by 3 or 5
     */
    public static void main(String[] args) {
        for (int i=0; i<=100; i++){
            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("===============================================");
        String name="ey edip adanada pide ye" +
                "";

        String result="";
        String result1="";
        for (int i=name.length()-1; i>=0; i--){
            result1+=name.substring(i,i+1);
            //result+=name.charAt(i);
           // System.out.print(name.charAt(i));
        }
        System.out.println(result1);
        if (result1.equalsIgnoreCase(name)){
            System.out.println(name+ "is a palindrome");
        }else {
            System.out.println(name+" is not a palindrome.");
        }
    }
}
