package day37_Constructors;

//import java.util.Arrays; //only imports Arrays class from java util
import java.util.*; //imports all the classes from java util

//import static day37_Constructors.Data.staticVariable; //only imports one static from the class

//import static day37_Constructors.Data.staticMethod;

import static day37_Constructors.Data.*;

public class ImportStatement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Arrays.sort(arr);

        System.out.println(staticVariable);
        staticMethod();
    }
}
