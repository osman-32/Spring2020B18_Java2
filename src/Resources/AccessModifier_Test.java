package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
       // System.out.println(obj.defaultaccess); //only accessible in the same package
        System.out.println(obj.publicAccess);// open to the world

        //System.out.println(obj.SSN); // private: only accesible in class
    }
}
