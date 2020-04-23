package day23_Methods;

public class Methods_WithParameters2 {
    // Create a function that can reverse any string
    //"Muhtar"==> "rathuM", "Cybertek"==> "ketrebyC"
    public static void main(String[] args) {
        ReverseString("Osman");
    }

    public static void ReverseString(String str){
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
