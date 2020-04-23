package day21MultiDimensionalArrays;

public class Emails {
    public static void main(String[] args) {
        String[] emails={"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String EachEmail:emails){
            if (EachEmail.contains("@gmail.com")){
                continue;
            }
            System.out.println(EachEmail);
        }
    }
}
