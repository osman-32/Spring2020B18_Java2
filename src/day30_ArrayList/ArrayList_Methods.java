package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
                list1.add(5);
                list1.add(7);
                list1.add(8);

        System.out.println(list1); //[5, 7, 8]


                list1.add(1,6);
        System.out.println(list1);  //[5,6, 7, 8]
              //  list1.add(10,7); index out of bound
        list1.set(3,9);

        System.out.println(list1);  //[5,6, 7, 9]
        System.out.println("=========================================");
        ArrayList<String> list2=new ArrayList<>();
                list2.add("A");
                list2.add("B");
        System.out.println(list2); // [A, B]

                list2.add(1,"C");
        System.out.println(list2);  // [A, C, B]
                list2.add(1,"D");
        System.out.println(list2); //[A, D, C, B]

                list2.set(3,"F");
        System.out.println(list2); //[A, D, C, F]
                list2.set(2,"E");
        System.out.println(list2); //[A, D, E, F]

        System.out.println("============================================");
        ArrayList<Integer> list3=new ArrayList<>();
                list3.add(1);
                list3.add(2);
                list3.add(3);
                list3.add(4);
        System.out.println(list3); //[1, 2, 3, 4]

                int a=1;
                list3.remove(a);
        System.out.println(list3); // [1, 3, 4]

                list3.add(1,2);
        System.out.println(list3); // [1, 2, 3, 4]
                Integer a1=1; // when we use wrapper, we remove the object not the element at the related index i.e. it
                                // removes the object 1.
                list3.remove(a1);
        System.out.println(list3); //[2, 3, 4]
        System.out.println("=================================================");
        ArrayList<Integer> list4=new ArrayList<>();
                list4.add(10);
                list4.add(20);
                list4.add(30);
        System.out.println(list4); // [10, 20, 30]
               // list4.remove(20); list4 has at most index 2, so index 20 is out of bound: Index:20, Size 3
                list4.remove(1);
        System.out.println(list4); //[10, 30]
                list4.add(1,20);
        System.out.println(list4);
                Integer a2=100;
                boolean r1=list4.remove(a2);
        System.out.println(r1); //false
        System.out.println(list4); // [10,20,30]

                Integer a3=10;
                boolean r2=list4.remove(a3);
        System.out.println(r2); //true
        System.out.println(list4);  // [20, 30]







    }
}
