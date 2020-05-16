package Turtles_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class appendPosSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(2,4,-5,6,-3,7,-7));
        ArrayList<Integer> result=appendPosSum(arr);
        System.out.println(result);


    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> arr){
        ArrayList<Integer> result=new ArrayList<>();




        int sum=0;
        for(int i=0; i<arr.size();i++){
            if(arr.get(i)>0){
                result.add(arr.get(i));
                sum+=arr.get(i);
            }
        }
        result.add(sum);
        return result;
    }
}
