package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
                list.add("A");
                list.add("B");
                list.add("C");
        System.out.println(list);  // [A, B, C]
                list.remove(1);
        System.out.println(list); // [A, C]
                list.add(1,"B");
        System.out.println(list); //[A, B, C]
        String str="B";
                list.remove(str);
        System.out.println(list); // A, C]
                list.add(1,"B");
        System.out.println(list); //[A, B, C]
        String str1="2";
                boolean r1= list.remove(str1);
        System.out.println(r1); //false
        System.out.println(list); // [A, B, C]
                boolean r2=list.remove(str);
        System.out.println(r2); //true
        System.out.println(list); // [A, C]
                list.add(1,"B");
        System.out.println(list); //[A, B, C]
                list.clear();
        System.out.println(list); //[]
        System.out.println("==================================");
        ArrayList<Integer> list2=new ArrayList<>();
                list2.add(1);
                list2.add(1);
                list2.add(2);
                list2.add(3);
        System.out.println(list2); //[1, 1, 2, 3]
               int num1=list2.indexOf(1);
        System.out.println(num1); //0
        System.out.println(list2.indexOf(1)); //0
                int num2=list2.indexOf(100);
        System.out.println(num2); // -1<--- means the object doesn't exist.
                int num3=list2.indexOf(3);
        System.out.println(num3);
    }
}
