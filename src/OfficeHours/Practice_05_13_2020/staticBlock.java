package OfficeHours.Practice_05_13_2020;

public class staticBlock {
    static String str;
            //static Excel excelsheet;

    static{
        str="Cybertek";
    }

    public static void main(String[] args) {
        str="Cybertek";
        System.out.println(str);
    }


}
class staticBlockTest{
    public static void main(String[] args) {
        System.out.println(staticBlock.str);
    }
}
