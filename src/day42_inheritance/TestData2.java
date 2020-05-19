package day42_inheritance;

public class TestData2 extends Accessmodifiers {
    /*
    publicVariable
    protectedVariable
     */
    public static void main(String[] args) {
        System.out.println(TestData2.publicVariable);
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable);

       // System.out.println(TestData2.privateVariable); private variable never be inherited.

        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();
       // TestData2.privateMethod(); private method too never be inherited
    }
}
