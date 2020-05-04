package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.setCatInfo("Siemes","White",3,"Sasha");
        System.out.println(cat1);

        Cat cat2=new Cat();
        cat2.setCatInfo("Scottish","Beige",7,"Bobo");
        System.out.println(cat2);

        Cat cat3=new Cat();
        cat3.setCatInfo("Calico", "brown-white",6,"Cinnamon");
        System.out.println(cat3);
        System.out.println("================================================");
        ArrayList<Cat> catList=new ArrayList<>(Arrays.asList(cat1,cat2,cat3));

        for (Cat each:catList){
            System.out.println(each);
        }
        System.out.println("============================================");
        cat1.sleep();
        cat2.sleep();
        cat3.sleep();
        System.out.println("====================================");
        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("sish kabab");

        System.out.println("=================================");
        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");

    }
}
