package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maaximum number from the list

            Do not use any sorting
         */
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);

        System.out.println(list.size());
    }
}
