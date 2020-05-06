package Turtles_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _198AppendPosSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(-3,4,5,-9,3,4));

            ArrayList<Integer> result=new ArrayList<>();
            int sum=0;
            for(int i=0; i<arr.size(); i++){
                if(arr.get(i)>0){
                    result.add(arr.get(i));
                    sum+=arr.get(i);
                }
            }
            result.add(sum);
        System.out.println(result);

        Collections.swap(arr,2,3);
        System.out.println(arr);
        ArrayList<String> wordList=new ArrayList<>(Arrays.asList("hi","hoy","hi","goy"));
        String targetWord="hi";
        for(int i=0; i<wordList.size(); i++){
            if(wordList.get(i).equals(targetWord)){
                wordList.remove(i);
            }
        }

        System.out.println(wordList);



    }
}
