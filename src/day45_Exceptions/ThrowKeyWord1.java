package day45_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyWord1 {

    public static void main(String[] args) {
        NoSuchElementException obj=new NoSuchElementException();
        //throw obj;

        //throw new NoSuchElementException();

        System.out.println();

        boolean breakTime=true;

      //  if (breakTime){
        //    throw new RuntimeException("It is break time");
       // }

        int[] arr={5,6,7};

        //System.out.println(arr[100]);
         throw new RuntimeException();

    }
}
