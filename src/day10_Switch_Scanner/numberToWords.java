package day10_Switch_Scanner;

public class numberToWords {
    /*
    write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
     */
    public static void main(String[] args) {
        byte num=4;
        String result=(num==1)?"Yek"
                :(num==2)?"Du"
                :(num==3)?"Se"
                :(num==4)?"Çar"
                :(num==5)?"Penc"
                :(num==6)?"Shesh"
                :(num==7)?"Heft"
                :(num==8)?"Hesht"
                :(num==9)?"Neh"
                :"Invalid";
        System.out.println(result);

    }
}
