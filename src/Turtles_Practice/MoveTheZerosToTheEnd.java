package Turtles_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveTheZerosToTheEnd {
    /*
    Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
     */
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(2,0,4,50,4,0,0,0,3));
        System.out.println(moveZeros(arr));

    }
    public static ArrayList<Integer> moveZeros(ArrayList<Integer> arr){
        ArrayList<Integer> result=new ArrayList<>();
        int count=0;
        for(int i=0; i<arr.size(); i++){
            if (arr.get(i)!=0){
                result.add(arr.get(i));
            }else{
                count++;
            }
        }
        while (count>0){
            count--;
            result.add(0);
        }
        return result;
    }
}
