package day29_Wrapper_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class List_Intro {
    public static void main(String[] args) {
        //ArrayList<DataType> listName=new ArrayList<DataType>();

        ArrayList<Integer> scores=new ArrayList<Integer>(); // size:0, adding five elements the size will be 5, removing
        //      mandatory                       optional               two elements the size will be 3, i.e. dynamic

            scores.add(10);
            scores.add(20);
            scores.add(30);


        System.out.println(scores);
        Integer a1=scores.get(2); //none
        int a2=scores.get(2);//unboxing
        double a3=scores.get(2);

        System.out.println(a3);
        System.out.println(scores.get(1));

    }

}
