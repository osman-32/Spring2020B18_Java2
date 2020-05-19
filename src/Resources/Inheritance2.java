package Resources;

import day42_inheritance.Accessmodifiers;


public class Inheritance2 extends Accessmodifiers {
    /*
    publicVariable
    protectedVariable

    publicMethod
    protectedMethod
     */
    public static void main(String[] args){
        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
        //System.out.println(Inheritance.defaultVariable); default and private variable cannot be inherited from a different package

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
       // Inheritance.defaultMethod(); default and private method cannot be inherited from a different package

        //visibility public>protected>default>private
    }

}
