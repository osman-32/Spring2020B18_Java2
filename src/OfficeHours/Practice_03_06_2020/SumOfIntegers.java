package OfficeHours.Practice_03_06_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SumOfIntegers {

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(3,5,4,5));

        int[] list2={2,1,6,2};

        System.out.println(sum(list1));

        System.out.println(sum(list2));

        System.out.println(reversed(list1));

        System.out.println(Arrays.toString(reversed(list2)));

        ArrayList<String> list3=new ArrayList<>(Arrays.asList("school","osman","gonul", "Bedirxan"));

        System.out.println(biggestLength(list3));

    }


    public static int sum(int[] arr){
        int result=0;
        for (int each:arr){
            result+=each;
        }
        return result;
    }

    public static int sum(ArrayList<Integer> arr){
        int result=0;
        for(Integer each:arr){
            result+=each;
        }
        return result;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> arr){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=arr.size()-1; i>=0; i--){
            list.add(arr.get(i));
        }

        return list;
    }

    public static int[] reversed(int[] arr){
        int[] list=new int[arr.length];
        int j=0;
        for (int i=arr.length-1; i>=0; i--){
            list[j]=arr[i];
            j++;
        }
        return list;
    }

    public static String biggestLength(ArrayList<String> arr){
        String result=arr.get(0);
        int max=arr.get(0).length();

        for (String each:arr){
            if(each.length()>max){
                result=each;
            }
        }
        return result;
    }
}
