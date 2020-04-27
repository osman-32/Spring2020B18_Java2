package day29_Wrapper_ArrayList;

import java.lang.reflect.AnnotatedArrayType;
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
        list.add(700);
        list.add(800);

        System.out.println(list.size());

        int maximum=Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++){
            if (list.get(i)>maximum){
                maximum=list.get(i);
            }
        }
        System.out.println(maximum);
        System.out.println("=======================================");

        System.out.println(max(list));
    }
    public static int max(ArrayList<Integer> list){
        int maximum=Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++){
            if(list.get(i)>maximum){
                maximum=list.get(i);
            }
        }
        return maximum;

    }
}
