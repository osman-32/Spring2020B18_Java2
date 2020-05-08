package day36_StaticBlock;

import day34_CustomClass.Tester;

public class staticBlock3 {
    static String name;
    static int num;

    static Tester tester1;

    static {
        name="Muhtar";
        num=100;
        tester1=new Tester();
        tester1.setTesterInfo("Jean",23434,"SDET", 120000);
    }

}
